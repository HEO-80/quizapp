package com.example.quizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Clase SplashActivity que hereda de AppCompatActivity.
 * Muestra una pantalla de bienvenida y carga las preguntas del cuestionario.
 */
public class SplashActivity extends AppCompatActivity {
    public static ArrayList<ModelClass> list;

    /**
     * Método onCreate que se llama cuando se crea la actividad.
     * @param savedInstanceState Bundle que contiene el estado guardado de la actividad.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        debugPrintQuestions(list);
    }

    /**
     * Método onResume que se llama cuando la actividad vuelve a estar activa.
     * Inicia DashboardActivity al reanudar.
     */
    @Override
    protected void onResume() {
        super.onResume();
        // Iniciar DashboardActivity en onResume
        Intent intent = new Intent(SplashActivity.this, DashboardActivity.class);
        startActivity(intent);
    }
    // Bloque estático para agregar preguntas al ArrayList list.
    static {
        list = new ArrayList<>();
        ///cultura general
       /* list.add(new ModelClass("Galileo fue un astrónomo italiano que desarrolló?", "Telescopio", "Avión", "Electricidad", "Tren", "Telescopio"));
        list.add(new ModelClass("¿Quién es el padre de la geometría?", "Aristóteles", "Euclides", "Pitágoras", "Kepler", "Euclides"));
        list.add(new ModelClass("El indio que venció a las computadoras en habilidades matemáticas es", "Ramanujam", "Rina Panigrahi", "Raja Ramanna", "Shakuntala Devi", "Shakuntala Devi"));
        list.add(new ModelClass("¿Quién es Larry Pressler?", "Político", "Pintor", "Actor", "Jugador de tenis", "Político"));
        list.add(new ModelClass("Michael Jackson es una persona distinguida en el campo de?", "Música pop", "Periodismo", "Deportes", "Actuación", "Música pop"));
        list.add(new ModelClass("¿Quién es conocido como 'Santa de las alcantarillas'?", "B.R. Ambedkar", "Madre Teresa", "Mahatma Gandhi", "Baba Amte", "Madre Teresa"));
        list.add(new ModelClass("¿Quién inventó la famosa fórmula E=mc^2?", "Albert Einstein", "Galileo", "Sarvesh", "Bill Gates", "Albert Einstein"));
        list.add(new ModelClass("¿Quién fue elegido como presidente de Estados Unidos en 2016?", "Donald Trump", "Hillary Clinton", "John Pol", "Barack Obama", "Donald Trump"));
        list.add(new ModelClass("¿Quién fue el fundador de la empresa Microsoft?", "Bill Gates", "Bill Clinton", "John Rio", "Steve Jobs", "Bill Gates"));
        list.add(new ModelClass("¿Quién fue el fundador de la empresa Apple?", "Steve Jobs", "Steve Washington", "Bill Gates", "Jobs Woods", "Steve Jobs"));
        list.add(new ModelClass("¿Quién fue el fundador de la empresa Google?", "Steve Jobs", "Bill Gates", "Larry Page", "Sundar Pichai", "Larry Page"));
        list.add(new ModelClass("¿Quién es conocido como el dios del cricket?", "Sachin Tendulkar", "Kapil Dev", "Virat Koli", "Dhoni", "Sachin Tendulkar"));
        list.add(new ModelClass("¿Quién ganó el Balón de Oro en 2015?", "Lionel Messi", "Cristiano Ronaldo", "Neymar", "Kaka", "Lionel Messi"));
        list.add(new ModelClass("¿Quién ganó el Balón de Oro en 2014?", "Neymar", "Lionel Messi", "Cristiano Ronaldo", "Kaka", "Cristiano Ronaldo"));
        list.add(new ModelClass("¿Quién fundó la plataforma de videojuegos más famosa, Steam?", "Bill Cliton", "Bill Williams", "Gabe Newell", "Bill Gates", "Gabe Newell"));
        list.add(new ModelClass("¿Qué vacuna contra el COVID-19 fue desarrollada por Pfizer y BioNTech?", "Moderna", "AstraZeneca", "Sputnik V", "Comirnaty", "Comirnaty"));
        list.add(new ModelClass("¿Quién es el CEO de Tesla y SpaceX?", "Jeff Bezos", "Elon Musk", "Richard Branson", "Tim Cook", "Elon Musk"));
        list.add(new ModelClass("¿Qué empresa es la creadora del sistema operativo Android?", "Apple", "Microsoft", "Google", "Amazon", "Google"));
        list.add(new ModelClass("¿En qué año fue fundada la Unión Europea?", "1957", "1993", "2001", "1945", "1993"));
        list.add(new ModelClass("¿Quién ganó las elecciones presidenciales de Estados Unidos en 2020?", "Joe Biden", "Donald Trump", "Hillary Clinton", "Bernie Sanders", "Joe Biden"));
        list.add(new ModelClass("¿Qué país es el mayor emisor de gases de efecto invernadero?", "China", "Estados Unidos", "India", "Rusia", "China"));
        list.add(new ModelClass("¿Cuál es la moneda oficial de Japón?", "Yen", "Won", "Dólar", "Euro", "Yen"));
        list.add(new ModelClass("¿Cuál es el océano más grande del mundo?", "Atlántico", "Índico", "Ártico", "Pacífico", "Pacífico"));
        list.add(new ModelClass("¿Cuál es la capital de Australia?", "Sídney", "Melbourne", "Brisbane", "Canberra", "Canberra"));
        list.add(new ModelClass("¿Cuál es el idioma oficial de Brasil?", "Español", "Inglés", "Portugués", "Francés", "Portugués"));
        list.add(new ModelClass("¿Qué país es el más poblado del mundo?", "India", "China", "Estados Unidos", "Indonesia", "China"));
        list.add(new ModelClass("¿Cuál es la red social más utilizada en el mundo?", "Facebook", "Twitter", "Instagram", "LinkedIn", "Facebook"));
        list.add(new ModelClass("¿En qué año fue fundada la empresa Amazon?", "1994", "2000", "1999", "1989", "1994"));
        list.add(new ModelClass("¿Cuál es el deporte más practicado en el mundo?", "Fútbol", "Baloncesto", "Cricket", "Tenis", "Fútbol"));
        list.add(new ModelClass("¿Qué país ganó la Copa del Mundo de la FIFA en 2018?", "Francia", "Croacia", "Brasil", "Alemania", "Francia"));
        list.add(new ModelClass("¿Quién es el autor de la serie de libros 'Juego de Tronos'?", "J.K. Rowling", "Stephen King", "George R.R. Martin", "Tolkien", "George R.R. Martin"));
        list.add(new ModelClass("¿Cuál es el elemento químico más abundante en la atmósfera terrestre?", "Oxígeno", "Hidrógeno", "Nitrógeno", "Dióxido de carbono", "Nitrógeno"));
        list.add(new ModelClass("¿Cuál es la fuente de energía renovable más utilizada en el mundo?", "Eólica", "Solar", "Hidroeléctrica", "Biomasa", "Hidroeléctrica"));
        list.add(new ModelClass("¿Cuál es el país con más medallas olímpicas en total?", "Estados Unidos", "China", "Rusia", "Alemania", "Estados Unidos"));
        list.add(new ModelClass("¿Cuál fue la primera película de Marvel Cinematic Universe?", "Iron Man", "The Incredible Hulk", "Thor", "Captain America: The First Avenger", "Iron Man"));
        list.add(new ModelClass("¿Cuál es el videojuego más vendido de todos los tiempos?", "Tetris", "Minecraft", "Super Mario Bros.", "Grand Theft Auto V", "Minecraft"));
        list.add(new ModelClass("¿Quién fue el ganador del Premio Nobel de la Paz en 2021?", "Malala Yousafzai", "Greta Thunberg", "World Food Programme", "Barack Obama", "World Food Programme"));
        list.add(new ModelClass("¿Cuál es la plataforma de streaming con más suscriptores?", "Netflix", "Amazon Prime Video", "Disney+", "Hulu", "Netflix"));
        list.add(new ModelClass("¿Cuál es el país más pequeño del mundo?", "Mónaco", "Vaticano", "San Marino", "Liechtenstein", "Vaticano"));
        list.add(new ModelClass("¿Qué equipo ganó la NBA en 2021?", "Los Angeles Lakers", "Miami Heat", "Milwaukee Bucks", "Phoenix Suns", "Milwaukee Bucks"));
        list.add(new ModelClass("¿Cuál es el edificio más alto del mundo?", "Burj Khalifa", "Shanghai Tower", "One World Trade Center", "Taipei 101", "Burj Khalifa"));
        list.add(new ModelClass("¿Qué empresa de tecnología lanzó el primer iPhone en 2007?", "Samsung", "Apple", "HTC", "Nokia", "Apple"));
        list.add(new ModelClass("¿Cuál es el nombre real de la cantante conocida como Lady Gaga?", "Stefani Joanne Angelina Germanotta", "Onika Tanya Maraj", "Katheryn Elizabeth Hudson", "Alicia Augello Cook", "Stefani Joanne Angelina Germanotta"));
        list.add(new ModelClass("¿Cuál es el autor del libro \"1984\"?", "George Orwell", "Aldous Huxley", "Ray Bradbury", "J.K. Rowling", "George Orwell"));
        list.add(new ModelClass("¿En qué año se lanzó el primer iPhone?", "2007", "2005", "2009", "2010", "2007"));
        list.add(new ModelClass("¿Quién escribió la obra de teatro \"Romeo y Julieta\"?", "William Shakespeare", "Oscar Wilde", "Arthur Miller", "Anton Chekhov", "William Shakespeare"));
        list.add(new ModelClass("¿Cuál es el país más poblado del mundo?", "China", "India", "Estados Unidos", "Brasil", "China"));
        list.add(new ModelClass("¿Quién pintó la Mona Lisa?", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo", "Leonardo da Vinci"));
        list.add(new ModelClass("¿Cuál es el río más largo del mundo?", "Nilo", "Amazonas", "Yangtsé", "Misisipi", "Nilo"));
        list.add(new ModelClass("¿Qué país ganó la Copa del Mundo de la FIFA 2018?", "Francia", "Croacia", "Brasil", "Alemania", "Francia"));
        list.add(new ModelClass("¿Cuál es el idioma más hablado del mundo?", "Chino mandarín", "Español", "Inglés", "Hindi", "Chino mandarín"));
        list.add(new ModelClass("¿Cuál es la capital de Canadá?", "Toronto", "Vancouver", "Ottawa", "Montreal", "Ottawa"));
        list.add(new ModelClass("¿Quién escribió la novela 'Cien años de soledad'?", "Gabriel García Márquez", "Mario Vargas Llosa", "Pablo Neruda", "Jorge Luis Borges", "Gabriel García Márquez"));
        list.add(new ModelClass("¿Cuál es el país más grande de África?", "Egipto", "Sudáfrica", "Nigeria", "Argelia", "Argelia"));
        list.add(new ModelClass("¿Quién fue el pintor del famoso cuadro 'La noche estrellada'?", "Pablo Picasso", "Vincent van Gogh", "Leonardo da Vinci", "Salvador Dalí", "Vincent van Gogh"));
        list.add(new ModelClass("¿Cuál es el planeta más cercano al Sol?", "Marte", "Venus", "Mercurio", "Júpiter", "Mercurio"));
        list.add(new ModelClass("¿En qué año se llevó a cabo la Revolución Rusa?", "1917", "1898", "1923", "1945", "1917"));
        list.add(new ModelClass("¿Cuál es el rango de edad para ser considerado un milenial?", "18-24 años", "25-34 años", "35-44 años", "45-54 años", "25-34 años"));
        list.add(new ModelClass("¿Quién escribió el libro 'Orgullo y prejuicio'?", "Emily Brontë", "Charlotte Brontë", "Jane Austen", "Virginia Woolf", "Jane Austen"));
        list.add(new ModelClass("¿Cuál es el océano más pequeño del mundo?", "Índico", "Atlántico", "Ártico", "Pacífico", "Ártico"));
        list.add(new ModelClass("¿En qué año se firmó la Declaración de Independencia de Estados Unidos?", "1776", "1789", "1804", "1820", "1776"));
        list.add(new ModelClass("¿Quién fue el primer presidente de Estados Unidos?", "George Washington", "Thomas Jefferson", "John Adams", "Abraham Lincoln", "George Washington"));
        list.add(new ModelClass("¿Cuál es el país más grande de América del Sur?", "Argentina", "Brasil", "Colombia", "Perú", "Brasil"));
        list.add(new ModelClass("¿Quién pintó la obra 'La última cena'?", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo", "Leonardo da Vinci"));
        list.add(new ModelClass("¿Cuál es el idioma oficial de Italia?", "Italiano", "Inglés", "Francés", "Alemán", "Italiano"));
        list.add(new ModelClass("¿En qué país se encuentra la Gran Muralla China?", "China", "Japón", "Corea del Sur", "India", "China"));
        list.add(new ModelClass("¿Quién escribió el libro 'El Gran Gatsby'?", "F. Scott Fitzgerald", "Ernest Hemingway", "Mark Twain", "J.D. Salinger", "F.Scott Fitzgerald"));
        list.add(new ModelClass("¿Cuál es el monte más alto del mundo?", "Monte Everest", "Monte Kilimanjaro", "Monte Aconcagua", "Monte Denali", "Monte Everest"));
        list.add(new ModelClass("¿Quién fue el pintor del famoso cuadro 'La Gioconda'?", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Salvador Dalí", "Leonardo da Vinci"));
        list.add(new ModelClass("¿Cuál es la moneda oficial de Reino Unido?", "Dólar", "Euro", "Libra esterlina", "Yen", "Libra esterlina"));
        list.add(new ModelClass("¿En qué país se encuentra la ciudad de Machu Picchu?", "Perú", "México", "Brasil", "Argentina", "Perú"));
        list.add(new ModelClass("¿Cuál es el deporte más popular en India?", "Cricket", "Fútbol", "Hockey", "Tenis", "Cricket"));
        list.add(new ModelClass("¿Quién escribió la obra de teatro 'Hamlet'?", "William Shakespeare", "Oscar Wilde", "Arthur Miller", "Anton Chekhov", "William Shakespeare"));
        list.add(new ModelClass("¿Cuál es el símbolo químico del oro?", "Go", "Ag", "Hg", "Au", "Au"));
        list.add(new ModelClass("¿En qué año se llevó a cabo la Revolución Francesa?", "1789", "1804", "1848", "1917", "1789"));
        list.add(new ModelClass("¿Cuál es el instrumento musical más antiguo?", "Piano", "Guitarra", "Flauta", "Violín", "Flauta"));
        list.add(new ModelClass("¿Quién fue el primer ser humano en orbitar la Tierra?", "Neil Armstrong", "Buzz Aldrin", "Yuri Gagarin", "Alan Shepard", "Yuri Gagarin"));
        list.add(new ModelClass("¿Cuál es el país más poblado de Europa?", "Alemania", "Francia", "Italia", "Rusia", "Rusia"));
        list.add(new ModelClass("¿Quién escribió la novela 'Moby-Dick'?", "Herman Melville", "Mark Twain", "Jules Verne", "Charles Dickens", "Herman Melville"));
        list.add(new ModelClass("¿Cuál es el metal más ligero?", "Aluminio", "Plata", "Cobre", "Litio", "Litio"));
        list.add(new ModelClass("¿En qué país se encuentra el Taj Mahal?", "India", "China", "Japón", "Tailandia", "India"));
        list.add(new ModelClass("¿Cuál es el país más grande de Oceanía?", "Australia", "Nueva Zelanda", "Fiyi", "Papúa Nueva Guinea", "Australia"));
        list.add(new ModelClass("¿Quién fue el autor de 'El principito'?", "Antoine de Saint-Exupéry", "Franz Kafka", "George Orwell", "J.R.R. Tolkien", "Antoine de Saint-Exupéry"));
        list.add(new ModelClass("¿Cuál es el río más caudaloso del mundo?", "Amazonas", "Nilo", "Yangtsé", "Misisipi", "Amazonas"));
        list.add(new ModelClass("¿En qué país se encuentra el Coliseo?", "Italia", "Francia", "España", "Grecia", "Italia"));
        list.add(new ModelClass("¿Cuál es el símbolo químico del hierro?", "Fe", "Hg", "Au", "Cu", "Fe"));
        list.add(new ModelClass("¿En qué año se llevó a cabo la Revolución Industrial?", "1760", "1820", "1898", "1914", "1760"));
        list.add(new ModelClass("¿Cuál es el país más grande de América del Norte?", "Estados Unidos", "Canadá", "México", "Brasil", "Canadá"));
        list.add(new ModelClass("¿Quién fue el pintor del famoso cuadro 'La persistencia de la memoria'?", "Salvador Dalí", "Pablo Picasso", "Vincent van Gogh", "Leonardo da Vinci", "Salvador Dalí"));
        list.add(new ModelClass("¿Cuál es el idioma oficial de Rusia?", "Ruso", "Inglés", "Alemán", "Francés", "Ruso"));
        list.add(new ModelClass("¿En qué año se llevó a cabo la Revolución Industrial?", "1760", "1820", "1898", "1914", "1760"));
        list.add(new ModelClass("¿Cuál es el país más grande de América del Norte?", "Estados Unidos", "Canadá", "México", "Brasil", "Canadá"));
        list.add(new ModelClass("¿Quién fue el pintor del famoso cuadro 'La persistencia de la memoria'?", "Salvador Dalí", "Pablo Picasso", "Vincent van Gogh", "Leonardo da Vinci", "Salvador Dalí"));
        list.add(new ModelClass("¿Cuál es el idioma oficial de Rusia?", "Ruso", "Inglés", "Alemán", "Francés", "Ruso"));
        list.add(new ModelClass("¿Cuál es la capital de Argentina?", "Buenos Aires", "Santiago", "Lima", "Montevideo", "Buenos Aires"));
        list.add(new ModelClass("¿Quién fue el autor del libro '1984'?", "George Orwell", "Aldous Huxley", "Ray Bradbury", "J.K. Rowling", "George Orwell"));
        list.add(new ModelClass("¿Cuál es el río más largo de América del Sur?", "Amazonas", "Paraná", "Orinoco", "Magdalena", "Amazonas"));
        list.add(new ModelClass("¿En qué país se encuentra la ciudad de Petra?", "Jordania", "Egipto", "Israel", "Líbano", "Jordania"));
        list.add(new ModelClass("¿Cuál es el símbolo químico del cobre?", "Co", "Cu", "Cb", "Cr", "Cu"));
        list.add(new ModelClass("¿Quién fue el primer presidente de México?", "Miguel Hidalgo", "Benito Juárez", "Porfirio Díaz", "Emiliano Zapata", "Guadalupe Victoria"));
        list.add(new ModelClass("¿Cuál es el animal más veloz del mundo?", "Guepardo", "Leopardo", "León", "Águila", "Guepardo"));
        list.add(new ModelClass("¿En qué año se llevó a cabo la Revolución Industrial?", "1760", "1820", "1898", "1914", "1760"));
        list.add(new ModelClass("¿Cuál es el país más pequeño de América Central?", "Belice", "El Salvador", "Panamá", "Costa Rica", "El Salvador"));
        list.add(new ModelClass("¿Quién escribió el libro 'Matar a un ruiseñor'?", "Harper Lee", "Ernest Hemingway", "F. Scott Fitzgerald", "Mark Twain", "Harper Lee"));
        list.add(new ModelClass("¿Cuál es el símbolo químico del sodio?", "So", "Na", "Se", "Si", "Na"));
        list.add(new ModelClass("¿En qué año se llevó a cabo la Revolución Industrial?", "1760", "1820", "1898", "1914", "1760"));
        list.add(new ModelClass("¿Cuál es el país más poblado de América Central?", "México", "Guatemala", "Honduras", "Nicaragua", "Guatemala"));
        list.add(new ModelClass("¿Quién pintó la obra 'Los girasoles'?", "Pablo Picasso", "Vincent van Gogh", "Leonardo da Vinci", "Salvador Dalí", "Vincent van Gogh"));
        list.add(new ModelClass("¿Cuál es el idioma oficial de China?", "Chino mandarín", "Inglés", "Cantonés", "Shanghainés", "Chino mandarín"));
        list.add(new ModelClass("¿En qué año se llevó a cabo la Revolución Industrial?", "1760", "1820", "1898", "1914", "1760"));
        list.add(new ModelClass("¿Cuál es el país más poblado de América Central?", "México", "Guatemala", "Honduras", "Nicaragua", "Guatemala"));
        list.add(new ModelClass("¿Quién pintó la obra 'Los girasoles'?", "Pablo Picasso", "Vincent van Gogh", "Leonardo da Vinci", "Salvador Dalí", "Vincent van Gogh"));
        list.add(new ModelClass("¿Cuál es el idioma oficial de China?", "Chino mandarín", "Inglés", "Cantonés", "Shanghainés", "Chino mandarín"));
        list.add(new ModelClass("¿Cuál es el país más poblado del mundo?", "India", "China", "Estados Unidos", "Indonesia", "China"));
        list.add(new ModelClass("¿Cuál es el océano más grande del mundo?", "Atlántico", "Índico", "Ártico", "Pacífico", "Pacífico"));
        list.add(new ModelClass("¿Cuál es la capital de Australia?", "Sídney", "Melbourne", "Brisbane", "Canberra", "Canberra"));
        list.add(new ModelClass("¿Cuál es el idioma oficial de Brasil?", "Español", "Inglés", "Portugués", "Francés", "Portugués"));
        list.add(new ModelClass("¿Qué país es el más poblado del mundo?", "India", "China", "Estados Unidos", "Indonesia", "China"));
        list.add(new ModelClass("¿Cuál es la red social más utilizada en el mundo?", "Facebook", "Twitter", "Instagram", "LinkedIn", "Facebook"));
        list.add(new ModelClass("¿En qué año fue fundada la empresa Amazon?", "1994", "2000", "1999", "1989", "1994"));
       */
        /// disney y anime
       /* list.add(new ModelClass("¿Cuál es la película de Disney con la princesa Ariel?", "La Sirenita", "Mulan", "Blancanieves y los siete enanitos", "Cenicienta", "La Sirenita"));
        list.add(new ModelClass("¿Quién es el villano principal en la película 'El Rey León'?", "Scar", "Jafar", "Ursula", "Maléfica", "Scar"));
        list.add(new ModelClass("¿Cuál es el nombre del personaje principal en la película 'La Bella y la Bestia'?", "Bella", "Aurora", "Cenicienta", "Jasmín", "Bella"));
        list.add(new ModelClass("¿En qué película de Disney aparece el personaje Woody?", "Toy Story", "Frozen", "El Libro de la Selva", "Enredados", "Toy Story"));
        list.add(new ModelClass("¿Cuál es el nombre de la princesa en la película 'Moana'?", "Moana", "Elsa", "Rapunzel", "Anna", "Moana"));
        list.add(new ModelClass("¿Quién es la hermana de Elsa en la película 'Frozen'?", "Anna", "Ariel", "Cinderella", "Belle", "Anna"));
        list.add(new ModelClass("¿Cuál es el nombre del león protagonista en la película 'El Rey León'?", "Simba", "Nala", "Timón", "Pumba", "Simba"));
        list.add(new ModelClass("¿Cuál es el nombre del villano en la película '101 Dálmatas'?", "Cruella de Vil", "Gaston", "Hades", "Maléfica", "Cruella de Vil"));
        list.add(new ModelClass("¿Cuál es la princesa que vive en un castillo bajo el mar?", "Ariel", "Bella", "Jasmín", "Mulan", "Ariel"));
        list.add(new ModelClass("¿Cuál es el nombre del ratón famoso de Disney?", "Mickey Mouse", "Donald Duck", "Goofy", "Pluto", "Mickey Mouse"));
        list.add(new ModelClass("¿Cuál es el nombre del príncipe en la película 'La Bella Durmiente'?", "Filip", "Eric", "Naveen", "Phillip", "Phillip"));
        list.add(new ModelClass("¿Cuál es la película de Disney basada en la historia de Aladino?", "Aladdin", "Tarzán", "El Jorobado de Notre Dame", "Pocahontas", "Aladdin"));
        list.add(new ModelClass("¿Quién es el acompañante de Pinocho en la película del mismo nombre?", "Grillo", "Gato", "Ave", "Perro", "Grillo"));
        list.add(new ModelClass("¿Cuál es el nombre de la princesa en la película 'La princesa y el sapo'?", "Tiana", "Jasmin", "Aurora", "Bella", "Tiana"));
        list.add(new ModelClass("¿Quién es el villano en la película 'La Sirenita'?", "Úrsula", "Maléfica", "Jafar", "Scar", "Úrsula"));
        list.add(new ModelClass("¿Cuál es el nombre del personaje principal en la película 'Mulan'?", "Mulan", "Mérida", "Pocahontas", "Moana", "Mulan"));
        list.add(new ModelClass("¿Quién es el hada madrina en la película 'La Cenicienta'?", "Hada Madrina", "Maléfica", "Flora", "Campanita", "Hada Madrina"));
        list.add(new ModelClass("¿Cuál es el nombre del villano en la película 'El Libro de la Selva'?", "Shere Khan", "Scar", "Jafar", "Hades", "Shere Khan"));
        list.add(new ModelClass("¿Cuál es el nombre de la protagonista en la película 'Enredados'?", "Rapunzel", "Ariel", "Bella", "Jasmín", "Rapunzel"));
        list.add(new ModelClass("¿Quién es el villano en la película 'La Bella y la Bestia'?", "Gaston", "Jafar", "Maléfica", "Ursula", "Gaston"));
        list.add(new ModelClass("¿Cuál es el nombre del capitán en la película 'Peter Pan'?", "James Garfio", "William Capitán", "Henry Gancho", "Oliver Garfio", "James Garfio"));
        list.add(new ModelClass("¿Cuál es el título original de la película 'El viaje de Chihiro'?", "Sen to Chihiro no kamikakushi", "Hauru no ugoku shiro", "Tonari no Totoro", "Kaze no tani no Naushika", "Sen to Chihiro no kamikakushi"));
        list.add(new ModelClass("¿Quién es el villano en la película 'El castillo ambulante'?", "Conde Castellan", "Barón Mágico", "Duque Oscuro", "Príncipe Sombrío", "Conde Castellan"));
        list.add(new ModelClass("¿Cuál es el nombre del príncipe en la película 'La princesa Mononoke'?", "Ashitaka", "Hiroshi", "Takeshi", "Yamato", "Ashitaka"));
        list.add(new ModelClass("¿Cuál es el nombre del espíritu del bosque en la película 'Mi vecino Totoro'?", "Totoro", "Haku", "Kiki", "Ponyo", "Totoro"));
        list.add(new ModelClass("¿Quién es el antagonista en la película 'La princesa Mononoke'?", "Lady Eboshi", "Princesa Mononoke", "Rey Lobo", "Dama Fantasma", "Lady Eboshi"));
        list.add(new ModelClass("¿Cuál es el nombre de la protagonista en la película 'El viaje de Chihiro'?", "Chihiro Ogino", "Kiki", "San", "Sophie Hatter", "Chihiro Ogino"));
        list.add(new ModelClass("¿Quién es el villano en la película 'El castillo en el cielo'?", "Muska", "Moro", "Calcifer", "No Face", "Muska"));
        list.add(new ModelClass("¿Cuál es el nombre del gato en la película 'El regreso de los gatos'?", "Barón", "Suzuki", "Jiji", "Meowth", "Barón"));
        list.add(new ModelClass("¿Quién es el antagonista en la película 'El castillo en el cielo'?", "Dola", "Sheeta", "Goliath", "Yubaba", "Dola"));
        list.add(new ModelClass("¿Cuál es el título original de la película 'El viento se levanta'?", "Kaze Tachinu", "Sakasama no Patema", "Kotonoha no Niwa", "Hotarubi no Mori e", "Kaze Tachinu"));
        list.add(new ModelClass("¿Quién es el villano en la película 'El increíble castillo vagabundo'?", "Suliman", "Sophie Hatter", "Calcifer", "Pazu", "Suliman"));
        list.add(new ModelClass("¿Cuál es el nombre del dragón en la película 'El viaje de Chihiro'?", "Haku", "Smaug", "Toothless", "Mushu", "Haku"));
        list.add(new ModelClass("¿Cuál es el título original de la película 'El recuerdo de Marnie'?", "Omoide no Mānī", "Koe no Katachi", "Bakemono no Ko", "Ponyo en el acantilado", "Omoide no Mānī"));
        list.add(new ModelClass("¿Quién es el villano en la película 'El recuerdo de Marnie'?", "Kazuhiko", "Setsuko", "Marnie", "Sayaka", "Kazuhiko"));
        list.add(new ModelClass("¿Cuál es el nombre del protagonista en la película 'El cuento de la princesa Kaguya'?", "Kaguya", "Taki", "Hiro", "Totoro", "Kaguya"));
        list.add(new ModelClass("¿Quién es el antagonista en la película 'El cuento de la princesa Kaguya'?", "Bamboo Cutter", "Okina", "Ishitsukuri", "Ryūjin", "Bamboo Cutter"));
        list.add(new ModelClass("¿Cuál es el título original de la película 'El viento sopla'?", "Kaze ga Tsuyoku Fuiteiru", "Kaze ga Tōru", "Kaze no Naka no Shōjo Kinpatsu no Jeanie", "Kaze no Tani no Nausicaä", "Kaze no Tani no Nausicaä"));
        list.add(new ModelClass("¿Quién es el villano en la película 'El viento sopla'?", "Orochimaru", "Kenshin Himura", "Kazuma Azuma", "Kushana", "Kushana"));
        list.add(new ModelClass("¿Cuál es el nombre de la protagonista en la película 'Arrietty y el mundo de los diminutos'?", "Arrietty", "Chihiro", "Yumeko", "Kiki", "Arrietty"));
        list.add(new ModelClass("¿Quién es el antagonista en la película 'Arrietty y el mundo de los diminutos'?", "Haru", "Tombo", "Jiro Horikoshi", "Maki", "Haru"));
        list.add(new ModelClass("¿Cuál es el título original de la película 'La princesa encantada'?", "Rusalochka", "Laputa: Castillo en el cielo", "Kaguya-hime no Monogatari", "Les Miserables: Shōjo Cosette", "Rusalochka"));
        list.add(new ModelClass("¿Quién es el villano en la película 'La princesa encantada'?", "Chernomor", "Totoro", "Howl", "No Face", "Chernomor"));
       */
        /// Marvel y DC
       /* list.add(new ModelClass("¿Cuál es el nombre del alter ego de Iron Man?", "Tony Stark", "Peter Parker", "Bruce Banner", "Steve Rogers", "Tony Stark"));
        list.add(new ModelClass("¿Quién interpreta a Spider-Man en el Universo Cinematográfico de Marvel?", "Tom Holland", "Andrew Garfield", "Tobey Maguire", "Robert Downey Jr.", "Tom Holland"));
        list.add(new ModelClass("¿Cuál es el nombre real de Black Widow?", "Natasha Romanoff", "Wanda Maximoff", "Carol Danvers", "Gamora", "Natasha Romanoff"));
        list.add(new ModelClass("¿Cuál es el metal utilizado para hacer el escudo del Capitán América?", "Vibranium", "Adamantium", "Uru", "Prometeo", "Vibranium"));
        list.add(new ModelClass("¿Quién es el villano principal en la película 'Avengers: Infinity War'?", "Thanos", "Loki", "Ultron", "Red Skull", "Thanos"));
        list.add(new ModelClass("¿Cuál es el nombre del martillo de Thor?", "Mjolnir", "Stormbreaker", "Gungnir", "Excalibur", "Mjolnir"));
        list.add(new ModelClass("¿Quién es el enemigo principal en la película 'Black Panther'?", "Erik Killmonger", "Red Skull", "Baron Zemo", "Vulture", "Erik Killmonger"));
        list.add(new ModelClass("¿Cuál es el nombre del grupo de superhéroes formado por Iron Man, Hulk, Thor, Capitán América, Viuda Negra y Ojo de Halcón?", "Avengers", "X-Men", "Fantastic Four", "Guardians of the Galaxy", "Avengers"));
        list.add(new ModelClass("¿Quién es el director de S.H.I.E.L.D. en las películas de Marvel?", "Nick Fury", "Tony Stark", "Steve Rogers", "Bruce Banner", "Nick Fury"));
        list.add(new ModelClass("¿Cuál es el nombre del planeta natal de Hulk?", "Sakaar", "Asgard", "Vormir", "Knowhere", "Sakaar"));
        list.add(new ModelClass("¿Quién interpreta a Black Panther en el Universo Cinematográfico de Marvel?", "Chadwick Boseman", "Michael B. Jordan", "Winston Duke", "Martin Freeman", "Chadwick Boseman"));
        list.add(new ModelClass("¿Cuál es el nombre del superhéroe que tiene un martillo llamado Stormbreaker?", "Thor", "Captain America", "Iron Man", "Hulk", "Thor"));
        list.add(new ModelClass("¿Quién es el líder de los X-Men?", "Charles Xavier", "Wolverine", "Magneto", "Cyclops", "Charles Xavier"));
        list.add(new ModelClass("¿Cuál es el nombre de la inteligencia artificial en la armadura de Iron Man?", "J.A.R.V.I.S.", "F.R.I.D.A.Y.", "Ultron", "Vision", "J.A.R.V.I.S."));
        list.add(new ModelClass("¿Quién es el enemigo principal en la película 'Captain America: The Winter Soldier'?", "Bucky Barnes / Winter Soldier", "Red Skull", "Baron Zemo", "Alexander Pierce", "Bucky Barnes / Winter Soldier"));
        list.add(new ModelClass("¿Cuál es el nombre real de Doctor Strange?", "Stephen Strange", "Peter Parker", "Bruce Banner", "Scott Lang", "Stephen Strange"));
        list.add(new ModelClass("¿Quién interpreta a Wolverine en las películas de X-Men?", "Hugh Jackman", "Ryan Reynolds", "James McAvoy", "Michael Fassbender", "Hugh Jackman"));
        list.add(new ModelClass("¿Cuál es el nombre del villano principal en la película 'Guardians of the Galaxy'?", "Ronan the Accuser", "Thanos", "Ego the Living Planet", "Nebula", "Ronan the Accuser"));
        list.add(new ModelClass("¿Quién es el líder de los Guardianes de la Galaxia?", "Star-Lord", "Gamora", "Rocket Raccoon", "Drax the Destroyer", "Star-Lord"));
        list.add(new ModelClass("¿Cuál es el nombre de la gema que otorga poderes de la mente en el Universo Cinematográfico de Marvel?", "Gema de la Mente", "Gema del Espacio", "Gema del Tiempo", "Gema del Poder", "Gema de la Mente"));
        list.add(new ModelClass("¿Quién interpreta a Deadpool en las películas de Marvel?", "Ryan Reynolds", "Tom Hardy", "Chris Pratt", "Benedict Cumberbatch", "Ryan Reynolds"));
        list.add(new ModelClass("¿Cuál es el nombre del villano principal en la película 'Ant-Man'?", "Darren Cross / Yellowjacket", "Obadiah Stane / Iron Monger", "Hank Pym", "Ghost", "Darren Cross / Yellowjacket"));
        list.add(new ModelClass("¿Quién es el enemigo principal en la película 'Thor: Ragnarok'?", "Hela", "Loki", "Malekith", "Grandmaster", "Hela"));
        list.add(new ModelClass("¿Cuál es el nombre del superhéroe que puede encogerse hasta el tamaño de una hormiga?", "Ant-Man", "Black Panther", "Hawkeye", "Falcon", "Ant-Man"));
        list.add(new ModelClass("¿Quién es el líder de los Avengers en las películas de Marvel?", "Capitán América", "Iron Man", "Thor", "Black Widow", "Capitán América"));
        list.add(new ModelClass("¿Cuál es el nombre del alter ego de Batman?", "Bruce Wayne", "Clark Kent", "Peter Parker", "Tony Stark", "Bruce Wayne"));
        list.add(new ModelClass("¿Quién es el archienemigo de Batman?", "Joker", "Lex Luthor", "Darkseid", "Riddler", "Joker"));
        list.add(new ModelClass("¿Cuál es el nombre real de Superman?", "Clark Kent", "Bruce Wayne", "Peter Parker", "Tony Stark", "Clark Kent"));
        list.add(new ModelClass("¿Quién es la superheroína conocida como la Princesa Amazona?", "Wonder Woman", "Black Widow", "Catwoman", "Supergirl", "Wonder Woman"));
        list.add(new ModelClass("¿Cuál es el nombre del velocista escarlata de DC Comics?", "Flash", "Green Arrow", "Hawkman", "Green Lantern", "Flash"));
        list.add(new ModelClass("¿Quién es el líder de la Liga de la Justicia?", "Batman", "Superman", "Wonder Woman", "Flash", "Batman"));
        list.add(new ModelClass("¿Cuál es el nombre del archienemigo de Superman?", "Lex Luthor", "Joker", "Darkseid", "Penguin", "Lex Luthor"));
        list.add(new ModelClass("¿Quién es el héroe conocido como el Rey de los Mares?", "Aquaman", "Green Lantern", "Cyborg", "Martian Manhunter", "Aquaman"));
        list.add(new ModelClass("¿Cuál es el nombre del héroe de piel verde y fuerza sobrehumana?", "Green Lantern", "Flash", "Cyborg", "Martian Manhunter", "Martian Manhunter"));
        list.add(new ModelClass("¿Quién es el archienemigo de Wonder Woman?", "Cheetah", "Poison Ivy", "Harley Quinn", "Catwoman", "Cheetah"));
        list.add(new ModelClass("¿Cuál es el nombre del superhéroe que usa arcos y flechas?", "Green Arrow", "Black Canary", "Hawkgirl", "Red Arrow", "Green Arrow"));
        list.add(new ModelClass("¿Quién es el enemigo principal de la Liga de la Justicia?", "Darkseid", "Thanos", "Ultron", "Sinestro", "Darkseid"));
        list.add(new ModelClass("¿Cuál es el nombre del héroe que puede cambiar de tamaño?", "Atom", "Hawkman", "Dr. Fate", "Black Lightning", "Atom"));
        list.add(new ModelClass("¿Quién es el archienemigo de Green Lantern?", "Sinestro", "Reverse Flash", "Black Adam", "Deathstroke", "Sinestro"));
        list.add(new ModelClass("¿Cuál es el nombre del detective y maestro del escapismo en DC Comics?", "Houdini", "Zatanna", "Constantine", "Batman", "Batman"));
        list.add(new ModelClass("¿Quién es el héroe con habilidades acuáticas y una mano de gancho?", "Aquaman", "Namor", "Black Manta", "Aqualad", "Aquaman"));
        list.add(new ModelClass("¿Cuál es el nombre de la ciudad protegida por Green Arrow?", "Star City", "Gotham City", "Metropolis", "Central City", "Star City"));
        list.add(new ModelClass("¿Quién es el héroe con la habilidad de volar y visión de calor?", "Superman", "Batman", "Flash", "Green Lantern", "Superman"));
        list.add(new ModelClass("¿Cuál es el nombre del superhéroe con el poder de la inmortalidad y la regeneración?", "Lobo", "Deathstroke", "Deadpool", "Wolverine", "Lobo"));
        list.add(new ModelClass("¿Quién es el villano principal en la serie de cómics de Batman conocido como 'Bane'?", "Bane", "Ra's al Ghul", "Two-Face", "Scarecrow", "Bane"));
        list.add(new ModelClass("¿Cuál es el nombre del superhéroe que puede controlar y comunicarse con las plantas?", "Swamp Thing", "Poison Ivy", "Man-Thing", "Vixen", "Swamp Thing"));
        list.add(new ModelClass("¿Quién es el archienemigo de Flash?", "Reverse Flash", "Captain Cold", "Gorilla Grodd", "Zoom", "Reverse Flash"));
        list.add(new ModelClass("¿Cuál es el nombre del superhéroe con habilidades acrobáticas y una capa de color rojo?", "Nightwing", "Red Robin", "Red Hood", "Robin", "Nightwing"));
        list.add(new ModelClass("¿Quién es el villano principal en la serie de cómics de Superman conocido como 'Doomsday'?", "Doomsday", "Metallo", "Brainiac", "Zod", "Doomsday"));
        list.add(new ModelClass("¿Cuál es el nombre del superhéroe que tiene la capacidad de controlar y generar electricidad?", "Black Lightning", "Static Shock", "Thunder", "Shazam", "Black Lightning"));
        list.add(new ModelClass("¿Quién es el archienemigo de Aquaman?", "Black Manta", "Ocean Master", "King Shark", "Orm", "Black Manta"));
        list.add(new ModelClass("¿Cuál es el nombre del superhéroe con la capacidad de proyectar rayos láser de sus ojos?", "Black Canary", "Supergirl", "Power Girl", "Heatwave", "Heatwave"));
        */
        /// Series television
        /*list.add(new ModelClass("¿Cuál es el nombre del protagonista de la serie 'Breaking Bad'?", "Walter White", "Jesse Pinkman", "Saul Goodman", "Gus Fring", "Walter White"));
        list.add(new ModelClass("¿Qué serie de televisión está ambientada en el mundo de Westeros?", "Game of Thrones", "The Walking Dead", "Stranger Things", "Friends", "Game of Thrones"));
        list.add(new ModelClass("¿Quién interpreta a Eleven en la serie 'Stranger Things'?", "Millie Bobby Brown", "Finn Wolfhard", "Gaten Matarazzo", "Noah Schnapp", "Millie Bobby Brown"));
        list.add(new ModelClass("¿Cuál es el nombre de la familia protagonista en 'Los Simpson'?", "Los Simpson", "Los Gómez", "Los Pérez", "Los López", "Los Simpson"));
        list.add(new ModelClass("¿Qué serie de televisión sigue las vidas de Ross, Rachel, Chandler, Monica, Joey y Phoebe?", "Friends", "The Big Bang Theory", "How I Met Your Mother", "Seinfeld", "Friends"));
        list.add(new ModelClass("¿Quién es el personaje principal en la serie 'Sherlock'?", "Sherlock Holmes", "John Watson", "Mycroft Holmes", "Jim Moriarty", "Sherlock Holmes"));
        list.add(new ModelClass("¿Cuál es el nombre del protagonista en la serie 'Stranger Things'?", "Mike Wheeler", "Dustin Henderson", "Lucas Sinclair", "Will Byers", "Will Byers"));
        list.add(new ModelClass("¿Qué serie de televisión sigue la vida de un grupo de estudiantes en la escuela secundaria Liberty High?", "13 Reasons Why", "Gossip Girl", "Riverdale", "The O.C.", "13 Reasons Why"));
        list.add(new ModelClass("¿Cuál es el nombre del villano principal en la serie 'Breaking Bad'?", "Gustavo Fring", "Hector Salamanca", "Tuco Salamanca", "Saul Goodman", "Gustavo Fring"));
        list.add(new ModelClass("¿Quién interpreta a Daenerys Targaryen en la serie 'Game of Thrones'?", "Emilia Clarke", "Lena Headey", "Sophie Turner", "Maisie Williams", "Emilia Clarke"));
        list.add(new ModelClass("¿Cuál es el nombre del protagonista en la serie 'The Walking Dead'?", "Rick Grimes", "Daryl Dixon", "Michonne", "Negan", "Rick Grimes"));
        list.add(new ModelClass("¿Qué serie de televisión está ambientada en el mundo de los superhéroes de DC Comics?", "Arrow", "The Flash", "Supergirl", "Legends of Tomorrow", "Arrow"));
        list.add(new ModelClass("¿Quién interpreta a Tony Stark / Iron Man en el Universo Cinematográfico de Marvel?", "Robert Downey Jr.", "Chris Evans", "Chris Hemsworth", "Mark Ruffalo", "Robert Downey Jr."));
        list.add(new ModelClass("¿Cuál es el nombre del protagonista en la serie 'Better Call Saul'?", "Jimmy McGill", "Mike Ehrmantraut", "Gus Fring", "Saul Goodman", "Jimmy McGill"));
        list.add(new ModelClass("¿Cuál es el nombre del protagonista en la serie 'Better Call Saul'?", "Jimmy McGill", "Mike Ehrmantraut", "Gus Fring", "Saul Goodman", "Jimmy McGill"));
        list.add(new ModelClass("¿Qué serie de televisión sigue la vida de un grupo de científicos en la Universidad de California en Pasadena?", "The Big Bang Theory", "Friends", "How I Met Your Mother", "The Office", "The Big Bang Theory"));
        list.add(new ModelClass("¿Quién interpreta a Sheldon Cooper en la serie 'The Big Bang Theory'?", "Jim Parsons", "Johnny Galecki", "Kaley Cuoco", "Simon Helberg", "Jim Parsons"));
        list.add(new ModelClass("¿Cuál es el nombre del protagonista en la serie 'House M.D.'?", "Gregory House", "James Wilson", "Allison Cameron", "Lisa Cuddy", "Gregory House"));
        list.add(new ModelClass("¿Qué serie de televisión sigue las aventuras de un grupo de supervivientes en un mundo postapocalíptico lleno de zombis?", "The Walking Dead", "Stranger Things", "Lost", "Breaking Bad", "The Walking Dead"));
        list.add(new ModelClass("¿Quién interpreta a Rick Grimes en la serie 'The Walking Dead'?", "Andrew Lincoln", "Norman Reedus", "Danai Gurira", "Jeffrey Dean Morgan", "Andrew Lincoln"));
        list.add(new ModelClass("¿Cuál es el nombre del protagonista en la serie 'Dexter'?", "Dexter Morgan", "Debra Morgan", "Harry Morgan", "Rita Morgan", "Dexter Morgan"));
        list.add(new ModelClass("¿Qué serie de televisión sigue las vidas de un grupo de amigos en Nueva York mientras buscan el amor y la felicidad?", "How I Met Your Mother", "Friends", "The Big Bang Theory", "Seinfeld", "How I Met Your Mother"));
        list.add(new ModelClass("¿Quién interpreta a Ted Mosby en la serie 'How I Met Your Mother'?", "Josh Radnor", "Jason Segel", "Cobie Smulders", "Neil Patrick Harris", "Josh Radnor"));
        list.add(new ModelClass("¿Cuál es el nombre del protagonista en la serie 'Breaking Bad'?", "Walter White", "Jesse Pinkman", "Saul Goodman", "Gus Fring", "Walter White"));
*/
        //Cesur Docencia preguntas Modulo 2 Materiales didacticos
        //tema1
        list.add(new ModelClass("Los procedimientos o medios que se utilizan para desarrollar y llevar a cabo el proceso de enseñanza-aprendizaje son:", "Recursos didácticos", "Medios didácticos", "Material didáctico", "Ninguna de las respuestas anteriores es correcta", "Recursos didácticos"));
        list.add(new ModelClass("Una de las ventajas de los materiales didácticos impresos de cara a los alumnos es:", "Estimular la curiosidad del alumnado", "Servir de apoyo a la explicación", "Evaluar habilidades aprendidas", "Mejorar la programación docente", "Estimular la curiosidad del alumnado"));
        list.add(new ModelClass("Entre las características del diseño gráfico de medios y recursos impresos se contempla el tipo de párrafo utilizado. El párrafo en el que todas sus líneas tienen sangría excepto la primera, se denomina:", "Párrafo alemán", "Párrafo francés", "Párrafo en bandera", "Párrafo lámpara invertida", "Párrafo francés"));
        list.add(new ModelClass("Seleccione, de entre las siguientes opciones, una de las características típicas de la retícula de una página:", "Facilita la maquetación por bloques", "Se imprime junto al contenido de la página", "Se utiliza para delimitar el tamaño de las imágenes", "Se marca solo en las páginas pares", "Facilita la maquetación por bloques"));
        list.add(new ModelClass("En la selección de medios y recursos gráficos, el color es una característica que hemos de analizar para que el contenido que ofrezcamos sirva para conseguir nuestros objetivos de una manera más directa. Si utilizamos el modelo de color CMYK hemos de saber que está basado en una síntesis de color:", "Sustractiva", "Sustantiva", "Suspensiva", "Sostenible", "Sustractiva"));
        list.add(new ModelClass("El guion didáctico permite analizar el contenido a transmitir, nivel de complejidad, la cantidad de información que vamos a impartir, etc. Este guion está formado por dos tipos de elementos: los generales y los específicos ¿A qué tipo corresponde 'los contenidos' que vamos a ofrecer a través del medio didáctico?", "Específico", "General", "Descriptivo", "Prescindible", "Específico"));
        list.add(new ModelClass("La selección de los materiales impresos debe realizarse y revisarse siempre...", "Al inicio del proceso formativo", "En una etapa intermedia del proceso formativo", "Al final del proceso formativo", "Es indiferente", "Al inicio del proceso formativo"));
        list.add(new ModelClass("La protección de la propiedad intelectual en España corresponde al...", "Ministerio de Cultura y Deporte", "Ministerio de Trabajo y Economía Social", "Ministerio de la Presidencia", "A cada Comunidad Autónoma, en el ejercicio de su autonomía", "Ministerio de Cultura y Deporte"));
        list.add(new ModelClass("El derecho de reproducción se relaciona con el:", "Derecho de explotación", "Derecho compensatorio de carácter patrimonial", "Derecho moral", "Derecho de reconocimiento de autor", "Derecho de explotación"));
        list.add(new ModelClass("¿Cuándo se produce la fatiga mental?", "Cuando la carga mental no se adapta a la capacidad de respuesta del sujeto", "Cuando hay mucho trabajo", "Cuando la carga mental se adapta a la capacidad de respuesta del sujeto", "Cuando notamos hormigueo en las piernas", "Cuando la carga mental no se adapta a la capacidad de respuesta del sujeto"));
        //Tema 2
        list.add(new ModelClass("Señale, de entre las siguientes, una de las funciones de los recursos gráficos:", "Complementaria", "Decorativa", "Vanguardista", "Secuenciada", "Complementaria"));
        list.add(new ModelClass("La regla de los Tercios es:", "Una herramienta para ubicar en 3 zonas los diferentes elementos en el mural", "Una herramienta para elaborar mapas conceptuales eficientes", "Una forma de establecer relaciones causales entre los diferentes elementos de un cartel", "Una forma de composición para ordenar los objetos de una imagen en 9 zonas", "Una forma de composición para ordenar los objetos de una imagen en 9 zonas"));
        list.add(new ModelClass("El Rotafolio:", "Es fácil de mantener pero difícil de almacenar dadas sus dimensiones", "Permite recuperar la información para momentos posteriores", "No permite llevar preparada la información previamente al desarrollo de la sesión formativa", "Solo es útil para alumnos de nivel avanzado", "Permite recuperar la información para momentos posteriores"));
        list.add(new ModelClass("Señale, de entre las siguientes, la característica incorrecta que no se debe seguir para una correcta exposición de sus argumentarios en una pizarra convencional:", "Escribir o dibujar la información en columnas", "Dividir la pizarra en dos mitades horizontalmente", "Escribir de arriba a abajo", "No borrar la información de una columna si comienza a escribir en la posterior", "Dividir la pizarra en dos mitades horizontalmente"));
        list.add(new ModelClass("¿Cuáles de las siguientes proposiciones no es una ventaja en el uso de la pizarra?", "Permite destacar las ideas clave", "El docente siempre está de cara a los alumnos", "No requiere apenas mantenimiento", "Permite la exposición esquemática y sintética de los contenidos", "El docente siempre está de cara a los alumnos"));
        list.add(new ModelClass("Indique cuáles son los principales elementos del cómic que muestran los diálogos de los personajes:", "Escenario", "Cuadros de textos", "Efectos cinematográficos", "Bocadillos", "Bocadillos"));
        list.add(new ModelClass("Relacione el organizador de ESQUEMA con el objetivo que persigue:", "Ejercicio de síntesis que permite entender las relaciones y dependencias entre diferentes elementos de un tema", "Suelen usarse para analizar un problema, elaborar un plan de acción o generar aportaciones sobre un tema", "Representación gráfica de las relaciones entre diferentes variables que intervienen en un proceso", "Plasma de forma gráfica las jerarquías y competencias de los diferentes elementos de una organización", "Ejercicio de síntesis que permite entender las relaciones y dependencias entre diferentes elementos de un tema"));
        list.add(new ModelClass("Además de los espacios, iluminación, tipo de mobiliario, etc., en la ubicación de los medios y materiales didácticos hay que tener en cuenta fundamentalmente la:", "Metodología", "Ideología", "Tendencia", "Estructura", "Metodología"));
        //Tema 3
        list.add(new ModelClass("Uno de los efectos que el uso de las TIC producen en la formación es la proliferación de medios que pueden usarse para el proceso de enseñanza-aprendizaje. Uno de estos medios es el proyector. Para que una proyección se visualice adecuadamente, el proyector debe tener una potencia de:", "Entre 500 y 750 lúmenes", "Entre 750 y 1000 lúmenes", "Entre 1000 y 1500 lúmenes", "Mayor de 1800 lúmenes", "Mayor de 1800 lúmenes"));
        list.add(new ModelClass("¿Cuál de las siguientes afirmaciones sobre la colocación del texto en una diapositiva no es correcta?", "No insertar más de 50 palabras en cada diapositiva", "Incluir solo información relevante", "Utilizar tipografías que contrasten fuertemente con el fondo", "Esquematizar la formación que se presenta", "Utilizar tipografías que contrasten fuertemente con el fondo"));
        list.add(new ModelClass("El uso del color en una diapositiva:", "Es una cuestión estética", "Es un recurso poco utilizado", "Es más importante que el texto", "Aporta contenido y significado a la diapositiva", "Aporta contenido y significado a la diapositiva"));
        list.add(new ModelClass("El color definido por los valores (0,0,0) equivale al:", "Blanco con intensidad cero en sus tres componentes", "Negro", "Blanco en su mínima intensidad", "Gris", "Negro"));
        list.add(new ModelClass("Las animaciones de los objetos en las presentaciones con diapositiva no sirve para:", "Captar y mantener la atención del alumnado", "Favorecer el recuerdo de lo presentado", "Motivar al alumnado", "Realizar simulaciones", "Realizar simulaciones"));
        list.add(new ModelClass("Relacione el principio de validez en la selección de contenidos con su significación pedagógica que las TIC han provocado en la formación:", "Sirven para alcanzar los objetivos propuestos", "Incluye contenidos que conciernen a la realidad", "Se adaptan a la competencia cognitiva del alumnado", "Superan una visión parcial de la realidad", "Superan una visión parcial de la realidad"));
        list.add(new ModelClass("En el proceso de inclusión de un hipervínculo en una diapositiva y a su posterior visionado que nos permita comprobar su funcionamiento, hay que tener en cuenta que...:", "El ordenador tenga siempre conexión a internet", "El ordenador tenga conexión a internet cuando es un hipervínculo externo", "El ordenador tenga conexión a internet cuando es un hipervínculo interno", "Que solo se puede vincular texto, nunca imágenes", "El ordenador tenga conexión a internet cuando es un hipervínculo externo"));
        list.add(new ModelClass(
                "Cuando se utiliza la cita de un autor en una presentación multimedia...:",
                "a. Es suficiente reseñar la obra de la que se ha extraído la cita en la parte final de la bibliografía de la presentación multimedia.",
                "b. Depende del formato de la presentación multimedia.",
                "c. Siempre se debe incluir el nombre completo del autor y la referencia completa de la obra en la diapositiva correspondiente.",
                "d. No es necesario citar al autor en una presentación multimedia.",
                "c. Siempre se debe incluir el nombre completo del autor y la referencia completa de la obra en la diapositiva correspondiente."
        ));
        //Tema 4
        list.add(new ModelClass("Para seleccionar y utilizar medios audiovisuales y multimedia de internet, necesitamos conocer algunos términos asociados a la red. Asocie \"Dominio\" con su definición:", "Es la dirección de un servidor concreto. Se define como grupo de ordenadores interconectados con otros principales", "Aplicación que extrae y muestra en pantalla información de servidores", "Aplicación que extrae y muestra en pantalla información de servidores", "Es el lenguaje de programación que se utiliza para desarrollar páginas web", "Es la dirección de un servidor concreto. Se define como grupo de ordenadores interconectados con otros principales"));
        list.add(new ModelClass("Los contenidos presentes en internet y en los entornos virtuales de aprendizaje están programados en HTML. Un texto en lenguaje de programación HTML se crea:", "A partir de tablas", "A partir de etiquetas", "A partir de lenguaje binario", "A partir de la herramienta \"copiar\"", "A partir de etiquetas"));
        list.add(new ModelClass("Las aplicaciones que nos permiten movernos por internet traduciendo el código HTML y mostrándolo en la pantalla son funciones básicas:", "Webs", "Navegadores web", "Buscadores", "Virus", "Navegadores web"));
        list.add(new ModelClass("El uso de las TIC y especialmente el correo electrónico a través de Internet provoca que estemos sometidos a procesos fraudulentos. Existen algunos correos que tienen por objetivo conseguir información privada de los usuarios, ¿cómo se le denomina a este tipo de correos?", "Virus", "Tags", "InPrivate", "Phishing", "Phishing"));
        list.add(new ModelClass("Los wikis son sitios web colaborativos con múltiples aplicaciones en el aula ya que permite diseñar de un modo flexible presentaciones multimedia con las variaciones que los participantes del wiki aporten. Indique de las siguientes la característica incorrecta:", "Permite subir y almacenar documentos", "No es posible la publicación de forma inmediata", "Se pueden insertar imágenes y vídeos", "Podemos hacer un seguimiento de las aportaciones del resto de miembros", "No es posible la publicación de forma inmediata"));
        list.add(new ModelClass("En los entornos virtuales de aprendizaje se utilizan diversos servicios que ofrecen algunos proveedores de internet y que podemos usar como apoyo a la impartición de formación. Relacione el BLOG con su definición:", "Aplicación que da soporte a opiniones y debates en línea entre varios usuarios", "Sitio web donde se alojan artículos, de texto o multimedia, ordenados cronológicamente", "Forma de comunicación en tiempo real entre usuarios basado en texto, imágenes y sonido", "Sitio web cuyos contenidos pueden ser editados y modificados por los usuarios", "Sitio web donde se alojan artículos, de texto o multimedia, ordenados cronológicamente"));
        //Tema 5
        list.add(new ModelClass("La PDI permite al profesor:", "Escribir y dibujar desde el ordenador", "Crear vídeos", "Permite escribir y dibujar directamente en la pizarra", "Ninguna de las anteriores es correcta", "Permite escribir y dibujar directamente en la pizarra"));
        list.add(new ModelClass("¿A través de qué medios se conecta normalmente la PDI al ordenador y este al proyector que evite riesgos en su conexión?", "Puerto USB y conector VGA", "Puerto USB y conector SFA", "Puerto RGB y conector FSI", "Ninguna de las anteriores es correcta", "Puerto USB y conector VGA"));
        list.add(new ModelClass("Una de las maneras de subsanar el fallo del ratón cuando estamos haciendo una presentación es tener a mano un puntero electrónico. El puntero electrónico cumple la misma función que el ratón del ordenador en las Pizarras Digitales. La punta del marcador cumple la misma función que...:", "El botón derecho del ratón", "El botón izquierdo del ratón", "La rueda central del ratón", "El botón Reset del ordenador", "El botón izquierdo del ratón"));
        list.add(new ModelClass("Señale, de entre los siguientes, un elemento que puede ser adaptado a una PDI y que facilita la labor de aprendizaje para personas con necesidades especiales.", "Sistema de audio (altavoces)", "Puntero magnético", "Sistema de colorimetría", "Tarjeta de vídeo", "Sistema de audio (altavoces)"));
        list.add(new ModelClass("Entre las características de una PDI hablamos del tiempo que tarda la pizarra en enviar la información de toque al ordenador, ¿A qué nos referimos?", "Tiempo de respuesta", "Resolución de pantalla", "Resolución de toque", "Superficie o área activa", "Tiempo de respuesta"));
        list.add(new ModelClass("Dentro de las finalidades didácticas de la PDI existe una de especial relevancia para alumnado con necesidades educativas especiales. Indique la correcta:", "El contenido se presenta a color", "Permite el aumento del tamaño de textos e imágenes", "Cada alumno dispone de un puntero electrónico", "Permite la traducción simultánea", "Permite el aumento del tamaño de textos e imágenes"));
        list.add(new ModelClass("¿Por qué se dice que el uso de la PDI puede suponer una optimización del tiempo para el docente? Señale la opción correcta:", "Porque no tiene que preparar las clases. El software ya las trae preparadas", "Porque se pueden reutilizar los contenidos de cursos anteriores para otras explicaciones", "Porque es el alumno el que debe preparar las clases", "Ninguna de las anteriores es correcta", "Porque se pueden reutilizar los contenidos de cursos anteriores para otras explicaciones"));
        list.add(new ModelClass(
                "¿Cuándo es recomendable hacer el calibrado de una PDI?",
                "a. Siempre que se mueva o traslade.",
                "b. Cada semana.",
                "c. Al inicio de cada sesión.",
                "d. Cada tres meses para PDI fijas y cada 15 días para PDI móviles.",
                "a. Siempre que se mueva o traslade."
        ));
        //Tema 6
         list.add(new ModelClass("Señale, de entre las siguientes, una de las principales características que definen una plataforma o aula virtual:", "Separación física entre profesor y alumnado", "Potencia la realización de actividades individuales", "Evita interferencias entre alumnado y entre docentes", "Potencia la memoria", "Evita interferencias entre alumnado y entre docentes"));
        list.add(new ModelClass("¿Qué significa que una plataforma sea de software libre?", "Que el código en el que está desarrollada es de libre uso y se puede modificar", "Que está desprotegida ante ataques por virus", "Que no se pueden añadir complementos", "Que tiene un plazo de vida determinado", "Que el código en el que está desarrollada es de libre uso y se puede modificar"));
        list.add(new ModelClass("El correo electrónico es una herramienta de comunicación de carácter...:", "Síncrono", "Asíncrono", "Eventual", "Rítmica", "Asíncrono"));
        list.add(new ModelClass("El libro de calificaciones de Moodle puede ser exportado para el tratamiento de datos a formato...:", "Base de datos", "Documento de texto", "Hoja de cálculo", "Presentación multimedia", "Hoja de cálculo"));
        list.add(new ModelClass("Señale, de entre las siguientes opciones, qué herramienta para la creación de videotutoriales es de tipo comercial (no gratuito):", "Camtasia Studio", "Camstudio", "Webinaria", "Aviscreen", "Camtasia Studio"));

        //pregutnas extra de ia
        list.add(new ModelClass(
                "Señale, de entre las siguientes opciones, qué herramienta para la creación de videotutoriales es de tipo comercial (no gratuito):",
                "a. Camtasia Studio",
                "b. Camstudio",
                "c. Webinaria",
                "d. Aviscreen",
                "a. Camtasia Studio"
        ));
/*

        list.add(new ModelClass(
                "¿Cuál de las siguientes afirmaciones es correcta acerca del uso de las TIC en la formación?",
                "a. Las TIC no tienen impacto en el proceso de enseñanza-aprendizaje.",
                "b. Las TIC solo son útiles para los estudiantes, no para los docentes.",
                "c. Las TIC pueden mejorar la accesibilidad, la interactividad y la diversidad en el aprendizaje.",
                "d. Las TIC solo se utilizan en la educación superior, no en niveles inferiores.",
                "c. Las TIC pueden mejorar la accesibilidad, la interactividad y la diversidad en el aprendizaje."
        ));

        list.add(new ModelClass(
                "¿Qué tipo de recurso se utiliza comúnmente para la creación de presentaciones multimedia en el ámbito educativo?",
                "a. Texto impreso en papel.",
                "b. Proyectores de diapositivas.",
                "c. Software de edición de vídeo.",
                "d. Software de presentación como PowerPoint.",
                "d. Software de presentación como PowerPoint."
        ));

        list.add(new ModelClass(
                "¿Cuál de las siguientes opciones es un ejemplo de plataforma virtual de aprendizaje?",
                "a. Microsoft Word.",
                "b. WhatsApp.",
                "c. Moodle.",
                "d. Facebook.",
                "c. Moodle."
        ));

        list.add(new ModelClass(
                "¿Qué es el aprendizaje colaborativo?",
                "a. Un proceso de aprendizaje individual basado en la memorización de información.",
                "b. Un enfoque que excluye la participación de los demás estudiantes.",
                "c. Un método en el que los estudiantes trabajan juntos para lograr objetivos comunes y construir conocimiento de forma colaborativa.",
                "d. Un enfoque que solo se utiliza en entornos virtuales de aprendizaje.",
                "c. Un método en el que los estudiantes trabajan juntos para lograr objetivos comunes y construir conocimiento de forma colaborativa."
        ));

        list.add(new ModelClass(
                "¿Cuál es uno de los beneficios del uso de recursos multimedia en el aula?",
                "a. Aumentar la complejidad y dificultad de los contenidos.",
                "b. Limitar la participación de los estudiantes.",
                "c. Facilitar la comprensión y retención de la información.",
                "d. Reducir la necesidad de adaptar el contenido a diferentes estilos de aprendizaje.",
                "c. Facilitar la comprensión y retención de la información."
        ));
        list.add(new ModelClass(
                "¿Cuál es uno de los principales roles del docente en el proceso de enseñanza-aprendizaje?",
                "a. Facilitar el acceso a los recursos educativos.",
                "b. Realizar actividades administrativas.",
                "c. Evaluar únicamente el conocimiento adquirido.",
                "d. Limitar la participación de los estudiantes.",
                "a. Facilitar el acceso a los recursos educativos."
        ));

        list.add(new ModelClass(
                "¿Qué aspecto se debe tener en cuenta al planificar una sesión formativa?",
                "a. Los intereses personales del docente.",
                "b. La duración máxima de la sesión.",
                "c. La disponibilidad de recursos tecnológicos.",
                "d. Excluir la participación activa de los estudiantes.",
                "c. La disponibilidad de recursos tecnológicos."
        ));

        list.add(new ModelClass(
                "¿Cuál es uno de los objetivos de la evaluación formativa?",
                "a. Calificar y clasificar a los estudiantes.",
                "b. Fomentar la competencia entre los estudiantes.",
                "c. Proporcionar retroalimentación para mejorar el aprendizaje.",
                "d. Establecer una jerarquía entre los estudiantes.",
                "c. Proporcionar retroalimentación para mejorar el aprendizaje."
        ));

        list.add(new ModelClass(
                "¿Qué estrategia puede utilizar el docente para fomentar la participación activa de los estudiantes en el aula?",
                "a. Promover la memorización de conceptos.",
                "b. Utilizar únicamente métodos expositivos.",
                "c. Fomentar la colaboración y el trabajo en equipo.",
                "d. Desestimar las opiniones y preguntas de los estudiantes.",
                "c. Fomentar la colaboración y el trabajo en equipo."
        ));

        list.add(new ModelClass(
                "¿Cuál es una ventaja de utilizar recursos audiovisuales en el proceso de enseñanza-aprendizaje?",
                "a. Aumentar la dificultad de comprensión de los contenidos.",
                "b. Limitar la participación de los estudiantes.",
                "c. Favorecer la retención y comprensión de la información.",
                "d. Reducir la necesidad de adaptar el contenido a diferentes estilos de aprendizaje.",
                "c. Favorecer la retención y comprensión de la información."
        ));

        list.add(new ModelClass(
                "¿Cuál es el objetivo principal de la retroalimentación en el proceso de enseñanza-aprendizaje?",
                "a. Calificar a los estudiantes.",
                "b. Motivar a los estudiantes.",
                "c. Proporcionar información para mejorar el aprendizaje.",
                "d. Comparar a los estudiantes con sus compañeros.",
                "c. Proporcionar información para mejorar el aprendizaje."
        ));

        list.add(new ModelClass(
                "¿Cuál de las siguientes afirmaciones describe mejor la enseñanza centrada en el estudiante?",
                "a. El docente es el único responsable de la transmisión de conocimientos.",
                "b. Los estudiantes deben seguir instrucciones sin hacer preguntas.",
                "c. Los estudiantes son activos en su propio aprendizaje y participan en la toma de decisiones.",
                "d. Los estudiantes deben adaptarse al estilo de enseñanza del docente.",
                "c. Los estudiantes son activos en su propio aprendizaje y participan en la toma de decisiones."
        ));

        list.add(new ModelClass(
                "¿Cuál de las siguientes opciones describe mejor el concepto de aprendizaje autónomo?",
                "a. Los estudiantes aprenden únicamente a través de la interacción con el docente.",
                "b. Los estudiantes deben seguir instrucciones sin cuestionarlas.",
                "c. Los estudiantes son responsables de su propio aprendizaje y toman la iniciativa en su proceso de aprendizaje.",
                "d. Los estudiantes dependen completamente de los recursos digitales para aprender.",
                "c. Los estudiantes son responsables de su propio aprendizaje y toman la iniciativa en su proceso de aprendizaje."
        ));

        list.add(new ModelClass(
                "¿Qué es la evaluación formativa?",
                "a. Una evaluación final que determina la calificación del estudiante.",
                "b. Una evaluación que se realiza al final de cada unidad temática.",
                "c. Una evaluación que proporciona retroalimentación y guía para mejorar el aprendizaje durante el proceso educativo.",
                "d. Una evaluación que se realiza únicamente en entornos virtuales de aprendizaje.",
                "c. Una evaluación que proporciona retroalimentación y guía para mejorar el aprendizaje durante el proceso educativo."
        ));

        list.add(new ModelClass(
                "¿Cuál de las siguientes opciones describe mejor el término 'flipped classroom' o aula invertida?",
                "a. Los estudiantes enseñan al docente en lugar de recibir instrucción.",
                "b. Los estudiantes aprenden en entornos virtuales sin la presencia del docente.",
                "c. Los estudiantes acceden a los contenidos y materiales de aprendizaje antes de la clase, y la clase se utiliza para actividades prácticas y de aplicación.",
                "d. Los estudiantes reciben instrucción exclusivamente a través de recursos multimedia.",
                "c. Los estudiantes acceden a los contenidos y materiales de aprendizaje antes de la clase, y la clase se utiliza para actividades prácticas y de aplicación."
        ));
*/


    }

    /**
     * Método debugPrintQuestions para imprimir las preguntas en el log de depuración.
     * @param questions ArrayList de preguntas a imprimir.
     */
    private void debugPrintQuestions(ArrayList<ModelClass> questions) {
        Log.d("Debug", "List size: " + questions.size());
        for (ModelClass question : questions) {
            Log.d("Debug", "Question: " + question.getQuestion());
        }
    }
}