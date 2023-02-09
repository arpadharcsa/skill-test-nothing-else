package com.cgi.boat.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class InMemoryPeopleSetup implements PeopleSetup {
    final static List<Person> people = Collections.unmodifiableList(Arrays.asList(
            new Person("Antonio", "Aakeel"),
            new Person("Khalid", "Abdalla"),
            new Person("John", "Acheson"),
            new Person("Robert", "Adair"),
            new Person("Robert", "Adams"),
            new Person("Hajaz", "Akram"),
            new Person("Edward", "Akrout"),
            new Person("Keith", "Alexander"),
            new Person("Adam", "Alexi-Malle"),
            new Person("Eric", "Allan"),
            new Person("Keith", "Allen"),
            new Person("Joss", "Ambler"),
            new Person("Jacob", "Anderson"),
            new Person("Paul", "Antony-Barber"),
            new Person("Dan", "Antopolski"),
            new Person("Jonathan", "Aris"),
            new Person("Peter", "Arne"),
            new Person("Anthony", "Asbury"),
            new Person("Arty", "Ash"),
            new Person("Will", "Attenborough"),
            new Person("John", "Atterbury"),
            new Person("David", "Auker"),
            new Person("Harry", "Baird"),
            new Person("Elliot", "Balchin"),
            new Person("Thomas", "Baptiste"),
            new Person("Nicholas", "Barnes"),
            new Person("Sacha-Baron", "Cohen"),
            new Person("John", "Barrett"),
            new Person("Chris", "Barrie"),
            new Person("Nigel", "Barrie"),
            new Person("Ray", "Barron"),
            new Person("John", "Barrowman"),
            new Person("Gerald", "Barry"),
            new Person("Robert", "Barton"),
            new Person("Tom", "Bateman"),
            new Person("Stanley", "Bates"),
            new Person("Richard", "Beale"),
            new Person("Richard", "Beaumont"),
            new Person("Victor", "Beaumont"),
            new Person("Andrew", "Beck"),
            new Person("John", "Benfield"),
            new Person("Max", "Bennett"),
            new Person("Omar", "Berdouni"),
            new Person("Heinz", "Bernard"),
            new Person("Daniel", "Betts"),
            new Person("Cecil", "Bevan"),
            new Person("Paul", "Bhattacharjee"),
            new Person("Donald", "Bisset"),
            new Person("Vas", "Blackwood"),
            new Person("Paul", "Blake"),
            new Person("Bill", "Blewitt"),
            new Person("James", "Bloor"),
            new Person("John", "Blundell"),
            new Person("John", "Bluthal"),
            new Person("Lee", "Boardman"),
            new Person("Philip", "Bond"),
            new Person("Khan", "Bonfils"),
            new Person("Hugh", "Bonneville"),
            new Person("Cornelius", "Booth"),
            new Person("Matthew", "Boulton"),
            new Person("Christopher", "Bowen"),
            new Person("Raymond", "Bowers"),
            new Person("Derrick", "Branche"),
            new Person("Kevin", "Brennan"),
            new Person("Max", "Brimmell"),
            new Person("Brit", "Pack"),
            new Person("Leo", "Britt"),
            new Person("Elwyn", "Brook-Jones"),
            new Person("Ian", "Brooker"),
            new Person("Maurice", "Browning"),
            new Person("Nigel", "Bruce"),
            new Person("James-Jaysen", "Bryhan"),
            new Person("Warwick", "Buckland"),
            new Person("Norman", "Budd"),
            new Person("Dennis", "Burgess"),
            new Person("Al", "Burnett"),
            new Person("Peter", "Burroughs"),
            new Person("Tom", "Busby"),
            new Person("Thomas", "Byrne"),
            new Person("Jim", "Bywater"),
            new Person("Wilfrid", "Caithness"),
            new Person("Earl", "Cameron"),
            new Person("Richie", "Campbell"),
            new Person("Michael", "Caridia"),
            new Person("John", "Carlin"),
            new Person("Clive", "Carter"),
            new Person("Peter", "Cartwright"),
            new Person("Gerald", "Case"),
            new Person("Henry", "Cavill"),
            new Person("Jason-Chan", "Chi-san"),
            new Person("Lobo", "Chan"),
            new Person("John", "Chandos"),
            new Person("Daniel", "Chatto"),
            new Person("Arthur", "Christiansen"),
            new Person("Christopher", "Chung"),
            new Person("D.A.", "Clarke-Smith"),
            new Person("Eric", "Clavering"),
            new Person("Steven", "Claydon"),
            new Person("Laddie", "Cliff"),
            new Person("Brian", "Coburn"),
            new Person("Bryan", "Coleman"),
            new Person("Wilson", "Coleman"),
            new Person("Ian", "Colin"),
            new Person("Patrick", "Connor"),
            new Person("Booth", "Conway"),
            new Person("Leagh", "Conwell"),
            new Person("Darcy", "Conyers"),
            new Person("Andrew", "Cooper"),
            new Person("Bert", "Coote"),
            new Person("Richard", "Cordery"),
            new Person("Campbell", "Cotts"),
            new Person("Paul-Courtenay", "Hyu"),
            new Person("Syd", "Courtenay"),
            new Person("Nicholas", "Courtney"),
            new Person("Tom", "Coventry"),
            new Person("Josh", "Cowdery"),
            new Person("Gordon", "Craig"),
            new Person("Michael", "Craig"),
            new Person("Andrew", "Crawford"),
            new Person("Steven", "Cree"),
            new Person("Adam", "Croasdell"),
            new Person("Richard", "Cubison"),
            new Person("James", "Culliford"),
            new Person("Desmond", "Cullum-Jones"),
            new Person("Charles", "Cullum"),
            new Person("Marc", "Culwick"),
            new Person("Freddie", "Cunliffe"),
            new Person("Dan", "Cunningham"),
            new Person("Ben", "Cura"),
            new Person("Alfie", "Curtis"),
            new Person("Robert", "Curtis"),
            new Person("Patric", "Curwen"),
            new Person("Marcus", "D'Amico"),
            new Person("Darrell", "D'Silva"),
            new Person("Timothy", "Dalton"),
            new Person("Mark", "Daly"),
            new Person("Lionel", "d'Aragon"),
            new Person("Michael", "Darbyshire"),
            new Person("Sabu", "Dastagir"),
            new Person("Sam", "Dastor"),
            new Person("Greg", "Davies"),
            new Person("Jonno", "Davies"),
            new Person("Windsor", "Davies"),
            new Person("Noel", "Davis"),
            new Person("Peter", "Jersey"),
            new Person("Raf-De-La", "Torre"),
            new Person("Guy", "Deghy"),
            new Person("Jamie", "Demetriou"),
            new Person("Aidan", "Devine"),
            new Person("Mark", "Dexter"),
            new Person("Gary", "Dobbs"),
            new Person("Richard", "Dolman"),
            new Person("Pip", "Donaghy"),
            new Person("Roy", "Dotrice"),
            new Person("Pavel", "Douglas"),
            new Person("Edgar", "Driver"),
            new Person("Carl", "Duering"),
            new Person("David", "Earl"),
            new Person("Sandor", "Elès"),
            new Person("Tom", "Ellis"),
            new Person("Nabil", "Elouahabi"),
            new Person("Michael", "Enright"),
            new Person("Lee", "Evans"),
            new Person("Roy", "Evans"),
            new Person("Tenniel", "Evans"),
            new Person("Lino", "Facioli"),
            new Person("David", "Fahm"),
            new Person("Anthony", "Faramus"),
            new Person("Rupert", "Farley"),
            new Person("Andrew", "Faulds"),
            new Person("Mem", "Ferda"),
            new Person("Peter", "Ferdinando"),
            new Person("Alex", "Ferns"),
            new Person("Dino", "Fetscher"),
            new Person("Alexander", "Field"),
            new Person("Gerald", "Fielding"),
            new Person("Freddie", "Fletcher"),
            new Person("Eric", "Flynn"),
            new Person("Peter", "Forster"),
            new Person("Anthony", "Forwood"),
            new Person("Gareth", "Forwood"),
            new Person("Jack", "Fox"),
            new Person("Richard", "Fox"),
            new Person("Brandon", "Francis"),
            new Person("Geff", "Francis"),
            new Person("Bob", "Franklin"),
            new Person("Daniel", "Fraser"),
            new Person("Dan", "Fredenburgh"),
            new Person("John", "Fricker"),
            new Person("Jordan", "Frieda"),
            new Person("Joel", "Fry"),
            new Person("David", "Gale"),
            new Person("Abhin", "Galeya"),
            new Person("Nitin", "Ganatra"),
            new Person("Sartaj", "Garewal"),
            new Person("John", "Garrick"),
            new Person("Akin", "Gazi"),
            new Person("Nicholas", "Gecks"),
            new Person("Robbie", "Gee"),
            new Person("Wallace", "Geoffrey"),
            new Person("Kulvinder", "Ghir"),
            new Person("Alan", "Gifford"),
            new Person("Marcus", "Gilbert"),
            new Person("Harry", "Gilbey"),
            new Person("Julian", "Gilbey"),
            new Person("Aden", "Gillett"),
            new Person("Peter", "Gilmore"),
            new Person("Iain", "Glen"),
            new Person("Peter", "Godfrey"),
            new Person("Iddo", "Goldberg"),
            new Person("Henry", "Golding"),
            new Person("Charles", "Goldner"),
            new Person("Bob", "Goody"),
            new Person("Peter", "Gordeno"),
            new Person("Alan", "Gordon"),
            new Person("Leslie-Howard", "Gordon"),
            new Person("Patrick", "Gordon"),
            new Person("Pat", "Gorman"),
            new Person("Derek", "Gorst"),
            new Person("Richard", "Goulding"),
            new Person("Arthur", "Goullet"),
            new Person("Gawn", "Grainger"),
            new Person("Richard", "Grant"),
            new Person("Mackenzie", "Gray"),
            new Person("Richard", "Graydon"),
            new Person("Nigel", "Greaves"),
            new Person("Garard", "Green"),
            new Person("Reginald", "Green"),
            new Person("Harry", "Hadden-Paton"),
            new Person("Oliver", "Haden"),
            new Person("Stephen", "Haggard"),
            new Person("Alan", "Haines"),
            new Person("Eric", "Hales"),
            new Person("John", "Hallam"),
            new Person("Gerald", "Hamer"),
            new Person("Hamilton", "Keene"),
            new Person("Robert", "Hands"),
            new Person("Paul", "Hardtmuth"),
            new Person("Arthur", "Hardy"),
            new Person("Tom", "Harper"),
            new Person("George", "Harris"),
            new Person("Jamie", "Harris"),
            new Person("Robert", "Harris"),
            new Person("Robert", "Hartley"),
            new Person("Morris", "Harvey"),
            new Person("Simon", "Harvey"),
            new Person("TJ", "Hassan"),
            new Person("Ben", "Hawkey"),
            new Person("Dominic", "Hawksley"),
            new Person("George", "Hayes"),
            new Person("Louis", "Hayward"),
            new Person("Craig", "Heaney"),
            new Person("Leon", "Herbert"),
            new Person("Colin", "Heywood"),
            new Person("Geoffrey", "Hibbert"),
            new Person("Philip", "Hill-Pearson"),
            new Person("Horace", "Hodges"),
            new Person("Dennis", "Hoey"),
            new Person("Michael", "Hogan"),
            new Person("David", "Holmes"),
            new Person("James", "Holmes"),
            new Person("John", "Houseman"),
            new Person("Billy", "Howle"),
            new Person("Robin", "Hughes"),
            new Person("Hugo", "Schuster"),
            new Person("Anthony", "Hulme"),
            new Person("David", "Hutcheson"),
            new Person("Peter", "Illing"),
            new Person("Anthony", "Ireland"),
            new Person("Ivan", "Brandt"),
            new Person("Kenneth", "Ives"),
            new Person("Gildart", "Jackson"),
            new Person("Inigo", "Jackson"),
            new Person("Saeed", "Jaffrey"),
            new Person("Adam", "James"),
            new Person("Oscar", "James"),
            new Person("Chris", "Jarman"),
            new Person("Tony", "Jayawardena"),
            new Person("Desmond", "Jeans"),
            new Person("Aaron", "Jeffcoate"),
            new Person("Douglas", "Jefferies"),
            new Person("Cornell", "John"),
            new Person("Barry", "Jones"),
            new Person("Clifton", "Jones"),
            new Person("Len", "Jones"),
            new Person("Patrick", "Jordan"),
            new Person("Edward", "Judd"),
            new Person("Eddie", "Kadi"),
            new Person("Hakeem", "Kae-Kazim"),
            new Person("Stefan", "Kalipha"),
            new Person("Richard", "Kay"),
            new Person("Toby", "Kebbell"),
            new Person("David", "Keir"),
            new Person("Christopher", "Kelham"),
            new Person("Ian", "Kelly"),
            new Person("Rez", "Kempton"),
            new Person("William", "Kendall"),
            new Person("Jamie", "Kenna"),
            new Person("Robin", "Kermode"),
            new Person("Alyy", "Khan"),
            new Person("Mark", "Killeen"),
            new Person("David", "King-Wood"),
            new Person("Martin", "King"),
            new Person("Geoffrey", "Kirkness"),
            new Person("Gertan", "Klauber"),
            new Person("Sebastian", "Knapp"),
            new Person("Harry", "Korris"),
            new Person("Steven", "Kynman"),
            new Person("Jonny", "Labey"),
            new Person("Jack", "Lambert"),
            new Person("Harold", "Lang"),
            new Person("Oliver", "Lansley"),
            new Person("John", "Lebar"),
            new Person("Robert", "Lee"),
            new Person("Austin", "Leigh"),
            new Person("Frank", "Leigh"),
            new Person("Tutte", "Lemkow"),
            new Person("Arthur", "Lennard"),
            new Person("Michael", "Lieber"),
            new Person("Barry", "Livesey"),
            new Person("Roger", "Livesey"),
            new Person("Christopher", "Llewellyn"),
            new Person("Frank", "Lloyd"),
            new Person("Frederick", "Lloyd"),
            new Person("Bobby", "Lockwood"),
            new Person("Reginald", "Long"),
            new Person("Ronald", "Long"),
            new Person("Guido", "Lorraine"),
            new Person("Gary", "Love"),
            new Person("Dyson", "Lovell"),
            new Person("Gregg", "Lowe"),
            new Person("William", "Luff"),
            new Person("David", "Lyon"),
            new Person("Harry-Agar", "Lyons"),
            new Person("John", "MacAndrews"),
            new Person("Tom", "Macaulay"),
            new Person("Simon", "MacCorkindale"),
            new Person("Thomas", "MacDonald"),
            new Person("Vivian", "MacKerrell"),
            new Person("Jamie", "Maclachlan"),
            new Person("Ian", "Maclaren"),
            new Person("Louis", "Mahoney"),
            new Person("Lauderdale", "Maitland"),
            new Person("Marne", "Maitland"),
            new Person("Philipp", "Manning"),
            new Person("Peter", "Marinker"),
            new Person("William", "Marlowe"),
            new Person("Richard", "Marner"),
            new Person("Tom", "Marshall"),
            new Person("Nathaniel", "Martello-White"),
            new Person("Trevor", "Martin"),
            new Person("Sean", "Mathias"),
            new Person("Eric", "Maturin"),
            new Person("Joseph", "May"),
            new Person("Richard", "Mazda"),
            new Person("Neil", "McCallum"),
            new Person("Hamish", "McColl"),
            new Person("Craig", "McGinlay"),
            new Person("Patrick", "McGoohan"),
            new Person("Ben", "McKay"),
            new Person("Alan", "McKenna"),
            new Person("Charles", "McKeown"),
            new Person("Clifford", "McLaglen"),
            new Person("Ian", "McLean"),
            new Person("Jim", "McManus"),
            new Person("Jack", "McNaughton"),
            new Person("Duncan", "McRae"),
            new Person("Stanley", "Meadows"),
            new Person("William", "Melling"),
            new Person("Bob", "Mercer"),
            new Person("André", "Mikhelson"),
            new Person("Danny", "Miller"),
            new Person("Spike", "Milligan"),
            new Person("Tim", "Mills"),
            new Person("Dan", "Milne"),
            new Person("Anthony", "Milner"),
            new Person("Nico", "Mirallegro"),
            new Person("David", "Mitchell"),
            new Person("Madhur", "Mittal"),
            new Person("Zia", "Mohyeddin"),
            new Person("Henry", "Mollison"),
            new Person("Gerard", "Monaco"),
            new Person("Ricardo", "Montez"),
            new Person("Sylvester", "Morand"),
            new Person("John", "Moreno"),
            new Person("Robert", "Morris"),
            new Person("Charles", "Mortimer"),
            new Person("George", "Mozart"),
            new Person("Lucian", "Msamati"),
            new Person("Douglas", "Muir"),
            new Person("Oliver", "Muirhead"),
            new Person("Ross", "Mullan"),
            new Person("George", "Murcell"),
            new Person("Danny", "Murphy"),
            new Person("Mike", "Myers"),
            new Person("Nathanael", "Saleh"),
            new Person("Akemnji", "Ndifornyen"),
            new Person("Ben", "Nealon"),
            new Person("Robin", "Nedwell"),
            new Person("Daniel", "Newman"),
            new Person("Phil", "Nice"),
            new Person("Arthur", "Nightingale"),
            new Person("Valentine", "Nonyela"),
            new Person("Josh", "O'Connor"),
            new Person("Vesey-Alfred", "Davoren"),
            new Person("Terence", "O'Brien"),
            new Person("Charles", "Oliver"),
            new Person("Vic", "Oliver"),
            new Person("Rex", "O'Malley"),
            new Person("Ben", "Onwukwe"),
            new Person("Dave", "O'Toole"),
            new Person("Peter", "O'Toole"),
            new Person("Dickie", "Owen"),
            new Person("Femi", "Oyeniran"),
            new Person("Michael", "Palin"),
            new Person("MacDonald", "Parke"),
            new Person("Alan", "Parnaby"),
            new Person("Ken", "Parry"),
            new Person("George", "Pastell"),
            new Person("Brendan", "Patricks"),
            new Person("Fred", "Paul"),
            new Person("Harry", "Peacock"),
            new Person("Kinsey", "Peile"),
            new Person("Cyril", "Percival"),
            new Person("Frank", "Perfitt"),
            new Person("Gerald", "Peters"),
            new Person("Brian", "Pettifer"),
            new Person("James", "Phelps"),
            new Person("Oliver", "Phelps"),
            new Person("Conrad", "Phillips"),
            new Person("Sam", "Phillips"),
            new Person("Simon", "Phillips"),
            new Person("Nicholas", "Phipps"),
            new Person("Archie", "Pitt"),
            new Person("Bo", "Poraj"),
            new Person("Ned", "Porteous"),
            new Person("Tim", "Potter"),
            new Person("Mark", "Powley"),
            new Person("Jeremy", "Price"),
            new Person("Heydon", "Prowse"),
            new Person("Hugh", "Pryse"),
            new Person("Parvez", "Qadir"),
            new Person("Simon", "Quarterman"),
            new Person("Danny", "Rahim"),
            new Person("Charles", "Ramsay"),
            new Person("Walter", "Randall"),
            new Person("Edward", "Randell"),
            new Person("Nayef", "Rashed"),
            new Person("Philip", "Ray"),
            new Person("Kavi", "Raz"),
            new Person("James", "Reardon"),
            new Person("Bernard", "Rebel"),
            new Person("Chris", "Reilly"),
            new Person("Robert", "Rendel"),
            new Person("Hamilton", "Revelle"),
            new Person("Paul", "Ritter"),
            new Person("Desmond", "Roberts"),
            new Person("Ewan", "Roberts"),
            new Person("Andrew", "Robertson"),
            new Person("Steven", "Robertson"),
            new Person("Dominic", "Roche"),
            new Person("Tony", "Rohr"),
            new Person("Charles", "Rolfe"),
            new Person("Levi", "Roots"),
            new Person("Hector", "Ross"),
            new Person("Michael", "Rothwell"),
            new Person("John", "Rowe"),
            new Person("Frank", "Rozelaar-Green"),
            new Person("Jolyon", "Rubinstein"),
            new Person("John", "Ruddock"),
            new Person("Alan", "Ruscoe"),
            new Person("Michael", "Ryan"),
            new Person("Andrew", "Sachs"),
            new Person("Leonard", "Sachs"),
            new Person("Chris", "Sandford"),
            new Person("George", "Sargeant"),
            new Person("Trevor", "Sather"),
            new Person("Lon", "Satton"),
            new Person("Martin", "Savage"),
            new Person("Adrian", "Schiller"),
            new Person("Frederick", "Schiller"),
            new Person("Johnnie", "Schofield"),
            new Person("Alex", "Scott"),
            new Person("John", "Sessions"),
            new Person("Roshan", "Seth"),
            new Person("Renu", "Setna"),
            new Person("Bruce", "Seton"),
            new Person("Dino", "Shafeek"),
            new Person("Partap", "Sharma"),
            new Person("Kavi", "Shastri"),
            new Person("Jeremy", "Sheffield"),
            new Person("Ronald", "Shiner"),
            new Person("Christopher", "Simpson"),
            new Person("Reginald", "Simpson"),
            new Person("Ronald", "Simpson"),
            new Person("Frank", "Singuineau"),
            new Person("Keith", "Skinner"),
            new Person("Ron", "Smerczak"),
            new Person("Ian", "Smith"),
            new Person("Robin", "Soans"),
            new Person("Abraham", "Sofaer"),
            new Person("Gem", "Souleyman"),
            new Person("Joe", "Sowerbutts"),
            new Person("David", "Spenser"),
            new Person("Sam", "Spruell"),
            new Person("Don", "Stannard"),
            new Person("Oliver", "Stark"),
            new Person("Paul", "Stassino"),
            new Person("David", "Sterne"),
            new Person("Athole", "Stewart"),
            new Person("Roy", "Stewart"),
            new Person("Barry", "Stokes"),
            new Person("Tom", "Stourton"),
            new Person("Henry", "Stuart"),
            new Person("Geoffrey", "Sumner"),
            new Person("John", "Sutton"),
            new Person("Smurfie", "Syco"),
            new Person("Tony", "Sympson"),
            new Person("Del", "Synnott"),
            new Person("Vic", "Tablian"),
            new Person("Kenji", "Takaki"),
            new Person("Tony", "Tang"),
            new Person("Colin", "Tapley"),
            new Person("Nick", "Tatham"),
            new Person("Larry", "Taylor"),
            new Person("Tom", "Terriss"),
            new Person("Damien", "Thomas"),
            new Person("Trevor", "Thomas"),
            new Person("Dave", "Thompson"),
            new Person("Stephen", "Thorne"),
            new Person("Wayne", "Thornton"),
            new Person("Ernesto", "Tomasini"),
            new Person("Steve", "Toussaint"),
            new Person("Bert", "Tracy"),
            new Person("Alfred", "Travers"),
            new Person("Spencer", "Trevor"),
            new Person("Ray", "Trickett"),
            new Person("Ernest", "Trimingham"),
            new Person("Meier", "Tzelniker"),
            new Person("Alec", "Utgoff"),
            new Person("Badi", "Uzzaman"),
            new Person("Harry", "Gorkum"),
            new Person("Ash", "Varrez"),
            new Person("Rhydian", "Vaughan"),
            new Person("Conrad", "Veidt"),
            new Person("Deepak", "Verma"),
            new Person("David", "Verrey"),
            new Person("Kenneth", "Villiers"),
            new Person("Daniel", "Vivian"),
            new Person("Frank", "Vosper"),
            new Person("Joivan", "Wade"),
            new Person("Douglas", "Wakefield"),
            new Person("Oliver", "Wakefield"),
            new Person("Martin", "Walker"),
            new Person("Rudolph", "Walker"),
            new Person("Stephen", "Walters"),
            new Person("John", "Warburton"),
            new Person("Ernest", "Warde"),
            new Person("John", "Warner"),
            new Person("Paul", "Warren"),
            new Person("Dennis", "Waterman"),
            new Person("Albert", "Welling"),
            new Person("Henry", "Wenman"),
            new Person("M.A.", "Wetherell"),
            new Person("Ben", "Whishaw"),
            new Person("Paul", "Whitehouse"),
            new Person("Sandy", "Whitelaw"),
            new Person("Nigel", "Whitmey"),
            new Person("Stephen", "Whittaker"),
            new Person("Matt", "Wilkinson"),
            new Person("Hywel", "Williams-Ellis"),
            new Person("Alan", "Williams"),
            new Person("Toby", "Williams"),
            new Person("Alister", "Williamson"),
            new Person("Brember", "Wills"),
            new Person("Frank", "Wilson"),
            new Person("Grahame", "Wood"),
            new Person("Jake", "Wood"),
            new Person("Norman", "Wooland"),
            new Person("Frederick", "Worlock"),
            new Person("Angus", "Wright"),
            new Person("John", "Wyman"),
            new Person("Peter", "Wyngarde"),
            new Person("Dan", "Young"),
            new Person("Will", "Young"),
            new Person("Ian", "Yule"),
            new Person("Peter", "Zander")
    ));

    @Override
    public List<Person> load() {
        return people;
    }
}
