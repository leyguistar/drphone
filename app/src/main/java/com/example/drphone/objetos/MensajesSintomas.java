package com.example.drphone.objetos;

import com.example.drphone.R;

public class MensajesSintomas {
    public static int maxSintomas = 26;
    public static Paciente paciente = new Paciente();
    public static double[] ponderacion = {1, 1, 0.5, 0.5, 1, 1, 1, 1, 0.5, 1, 1, 1, 0.5, 1, 1, 0.5, 1, 1, 1, 0.5, 0.5, 0.5, 0.5, 0.5, 1, 1};
    public static int[] audios = {R.raw.a0, R.raw.a1, R.raw.a2, R.raw.a3, R.raw.a4, R.raw.a5, R.raw.a6, R.raw.a7, R.raw.a8, R.raw.a9, R.raw.a10, R.raw.a11, R.raw.a12, R.raw.a13, R.raw.a14, R.raw.a15, R.raw.a16, R.raw.a17, R.raw.a18, R.raw.a19, R.raw.a20, R.raw.a21, R.raw.a22, R.raw.a23, R.raw.a24, R.raw.a25};
    public static String[] textos = {"Ingrese su temperatura",
            "¿Posee Tos seca?",
            "¿A tenido dolor de cabeza?",
            "¿Está presentando cansancio?",
            "¿Está presentando dolor muscular?",
            "¿Está presentando dolor en las articulaciones",
            "¿Está presentando congestión nasal?",
            "¿Tiene dolor de garganta?",
            "¿Está presentando conjuntivitis?",
            "¿Está presentando diarrea o malestar estomacal?",
            "¿Tiene perdida de sentido del gusto?",
            "¿Tiene perdida de sentido del olfato?",
            "¿Está presentando erupciones cutáneas?",
            "¿Está presentando náuseas?",
            "¿Siente escalofríos?",
            "¿A sufrido de vértigo recientemente?",
            "¿Está presentado dificultad para respirar?",
            "¿Siente presión en el pecho?",
            "¿Tiene incapacidad para hablar o moverse?",
            "¿Está presentando pérdida de apetito?",
            "¿Presenta confusión?",
            "¿Presenta ansiedad?",
<<<<<<< HEAD
            "¿Presenta depresión?",
            "¿Presenta trastorno de sueño?",
            "Ingrese su saturación",
            "¿A tenido contacto con alguien que tenga covid-19?"};
}
=======
            "¿Presenta depresion?",
            "¿Presenta transtorno de sueño?",
            "Ingrese su saturacion",
            "¿A tenido contacto con alguien que tenga covid?"};
    public static String[] titulos = {
            "Temperatura",
            "Tos seca",
            "Dolor de cabeza",
            "Cansancio ",
            "Dolores musculares ",
            "Dolores en las articulaciones ",
            "Congestion nasal",
            "Dolor de garganta",
            "Conjuntivitis",
            "Diarrea ",
            "Pérdida del sentido del olfato",
            "Pérdida del sentido del gusto",
            "Erupciones cutáneas ",
            "Nauseas",
            "Escalofrios",
            "Vertigo",
            "Dificultad para respirar",
            "Presion de pecho",
            "Incapacidad para hablar o moverse",
            "Perdida de apetito.",
            "Confusion",
            "Ansiedad",
            "Depresion",
            "Trastorno de sueño   ",
            "Saturacion",
            "Contacto con posible covid"
    };
    public static String[] ayudas = {
            "La temperatura corporal puede ser tomada por un termómetro, en promedio debería estar entre los 36.5° a 37.5°.",
            "La tos es una acción refleja que limpia las vías respiratorias de irritantes y mucosidad.",
            "Sentir una presión en la cabeza leve o moderada, que genere incomodidad, dificultad para generar análisis o se vea afectada o incrementada al momento de realizar actividades físicas.",
            "Has presentado la sensación de agotamiento similar a la obtenida luego de realizar actividades físicas que ameriten un arduo esfuerzo físico, sin haberlas realizado previamente.",
            "Presentas molestias en uno o varios músculos en particular, permanentemente o cuando tienes contacto con dicho musculo.  ",
            "Estas presentando sensación de dolor en las articulaciones, coyunturas o uniones entre extremidades, en general estos dolores se ven reflejados al momento de realizar actividades físicas, pero pueden quedar presentado permanente molestia en el paciente.",
            "Pasajes nasales inflamados por el exceso de fluidos y mucosidad, dificultando la respiración, puede ser debido a una infección, humo de tabaco o perfumes.",
            "Dolor o irritación en la garganta que puede ocurrir o no al tragar. A menudo acompaña a las infecciones, como un resfriado o la gripe. ",
            "Inflamación o infección de la membrana externa del globo ocular y el párpado interno. Esta presentando enrojecimiento en el glóbulo ocular.",
            "Heces blandas y líquidas con mayor frecuencia de lo habitual.",
            "No posees la capacidad de distinguir olores.",
            "No posees la capacidad de distinguir sabores",
            "Brote temporal de parches de piel enrojecidos, con bultos, escamas o picazón; posiblemente con ampollas o ronchas.",
            "Sensación de náuseas que incluye ganas de vomitar.",
            "Sensación de tener frío, a menudo acompañada de temblores o escalofríos, aunque no estés necesariamente en un ambiente frío.",
            "Es una sensación giratoria repentina que se manifiesta de forma interna o externa, y que suele producirse al mover la cabeza rápidamente.",
            "La dificultad para respirar puede involucrar Respiración difícil,  respiración incómoda, sentirse como si no estuviera recibiendo suficiente aire.",
            "La angina, también llamada angina de pecho, se describe a menudo como una sensación de presión, pesadez, opresión o dolor en el pecho.",
            "Dificultad o total incapacidad de poder pronunciar palabras, modularizar frases o moverse, señalar o mantener sujetado algún objeto ",
            "Saciedad o sensación nula que produzca ",
            "Distorsión entre la realidad y el espacio tiempo",
            "Sensación de desesperación e impaciencia que no te permite tranquilizarte.",
            "Sentimientos de baja euforia, que suprime tus motivaciones o crean nuevas preocupaciones.",
            "Dificultad para conciliar el sueño, reacción en cadena que te despierta en altas horas de la noche y no te permite continuar durmiendo",
            "Un nivel normal de oxígeno ABG en pulmones sanos cae entre 80 y 100 milímetros de mercurio (mm Hg). Si tu nivel de oxígeno en la sangre se midió con un oxímetro de pulso (SpO2), una lectura normal usualmente se encuentra entre 95 por ciento y 100 por ciento.",
            "Has tenido contacto con o sin protección con alguna persona que este presentando el virus del covid-19 en los últimos 14 días."
    };
}
>>>>>>> 1861e55d3b1109c3e2dbded86d90a50edbb7df32
