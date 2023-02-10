package com.cgi.boat.interview;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PeopleDataAnalyser {

    private static final int TO_FIXED_VALUE = 3;
    private static final NameStatisticMapper TO_NAME_STATISTIC = new NameStatisticMapper();

    static List<NameStatistic> findTopFirstNameByOccourence(Map<String, List<String>> lastByFirst) {
        return lastByFirst.entrySet()
                .stream()
                .map(TO_NAME_STATISTIC)
                .sorted()
                .limit(TO_FIXED_VALUE)
                .collect(Collectors.toList());
    }

    private static class NameStatisticMapper implements Function<Map.Entry<String, List<String>>, NameStatistic> {

        @Override
        public NameStatistic apply(Map.Entry<String, List<String>> entry) {
            return NameStatistic.from(entry.getKey(), entry.getValue().size());
        }
    }
}
