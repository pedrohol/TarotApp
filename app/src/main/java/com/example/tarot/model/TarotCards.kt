package com.example.tarot.model

import android.R.attr.name
import androidx.collection.intIntMapOf
import com.example.tarot.R


class TarotCards: CardRepository {
    override fun cardDeck(): MutableList<Card> {
        return mutableListOf(
            Card(
                name = "Ás de Paus",
                description = "O Ás de Paus significa um novo começo - ou que existe um potencial para tal, envolto em criatividade e entusiasmo. Pode ser um novo relacionamento, um novo emprego ou qualquer nova empreitada que esteja nos seus planos ou tenha sido mentalizada.",
                image = R.drawable.card_as_de_paus
            ),
            Card(
                name = "Dois de Paus",
                description = "O 2 de Paus significa basicamente planejamento e decisões. Como é uma carta de dualidade, você pode se sentir dividido(a) entre duas escolhas. Às vezes não são escolhas tão importantes, mas agora parecem ser. Esse Arcano Menor traz consigo ansiedade e sentimentos extremos. Fique alerta com tudo que acontece a sua volta e siga seus instintos para evitar perdas.",
                image = R.drawable.card_dois_de_paus
            ),
            Card(
                name = "Três de Paus",
                description = "O 3 de Paus sugere que você deve tomar uma iniciativa. Esse arcano menor indica sucesso, mas para alcançá-lo, é necessário agir. Coragem é uma palavra que você deve ter em mente. Há uma correspondência energética que sugere mudança e você deve arriscar para transformar seus sonhos em realidade.",
                image = R.drawable.card_tres_de_paus
            ),
            Card(
                name = "Quatro de Paus",
                description = "O 4 de Paus significa que boas surpresas podem estar a caminho. Se você está passando por um momento complicado, esse Arcano Menor traz boas notícias e indica que os problemas ou perturbações logo poderão ficar para trás.",
                image = R.drawable.card_quatro_de_paus
            ),
            Card(
                name = "Cinco de Paus",
                description = "O 5 de paus significa que você pode estar no caminho errado em alguma questão, gastando energia em prol de algo mas parece haver resistência envolvida de alguma forma - ou alguém está competindo com você. Esse arcano alerta que você deve repensar suas estratégias e alterar seu rumo se quiser alcançar seus objetivos.",
                image = R.drawable.card_cinco_de_paus
            ),
            Card(
                name = "Seis de Paus",
                description = "O 6 de Paus significa basicamente sucesso e que problemas podem ser superados no momento, sugerindo o desfrutar de uma vitória merecida. Em uma consulta, indica que um momento de sucesso e reconhecimento pode estar próximo. Sugere que você tem a vantagem na situação em questão e que há chances de sair vencedor(a).",
                image = R.drawable.card_seis_de_paus
            ),
            Card(
                name = "Sete de Paus",
                description = "O 7 de Paus sugere que você será ou pode estar sendo testado(a). Sua integridade é posta à prova e se você se mantiver fiel às suas crenças, poderá conseguir algo que há muito busca. A estrada nunca é fácil e certamente você teve que lutar muito para chegar até o momento, mas se você manteve sua ética e moral, pode aguardar sua recompensa.",
                image = R.drawable.card_sete_de_paus
            ),
            Card(
                name = "Oito de Paus",
                description = "O 8 de Paus significa ação, movimento e mudança. Esse Arcano Menor alerta para decisões rápidas, onde você deverá utilizar a sua intuição. Há também a chance de um convite inesperado. Se você estiver enfrentando conflitos e problemas, tudo pode mudar de uma hora para outra.",
                image = R.drawable.card_oito_de_paus
            ),
            Card(
                name = "Nove de Paus",
                description = "O 9 de Paus significa que o Universo pode estar provendo a energia necessária para superar qualquer obstáculo no momento. Porém, não aja impulsivamente. Seja qual for a situação, tente analisá-la bem, equilibre mente e corpo, intuição e ação. Você deve ter paciência e sabedoria para lidar com a questão ou o atual momento, dessa forma conseguirá lidar com qualquer adversidade.",
                image = R.drawable.card_nove_de_paus
            ),
            Card(
                name = "Dez de Paus",
                description = "O 10 de Paus significa sobrecarga. Ou seja, sugere que você pode estar sobrecarregado(a) pelas responsabilidades e desafios do dia a dia ou relacionados à questão perguntada. Porém, a carta também traz uma mensagem positiva: este ciclo pode estar chegando ao fim e você conseguirá realizar seus objetivos. Ao mesmo tempo, a carta também traz um alerta sobre sucessos temporários. Se algo está muito perfeito, tome cuidado pois obstáculos podem surgir.",
                image = R.drawable.card_dez_de_paus
            ),
            Card(
                name = "Valete de Paus",
                description = "O Valete de Paus geralmente significa o recebimento de uma boa notícia. É uma carta que carregam muita energia positiva, assim sugere que você poderá se sentir renovado(a) na situação em questão. A carta sugere a disponibilidade do combustível necessário para novos começos e realizações. O Valete de Paus trata basicamente sobre algo novo e excitante aparecendo.",
                image = R.drawable.card_valete_de_paus
            ),
            Card(
                name = "Cavaleiro de Paus",
                description = "O Cavaleiro de Paus significa energias renovadas. Um novo e inesperado caminho pode se abrir e a carta sugere que você pode querer entrar nele de cabeça. Esta carta traz impulsividade e coragem para desbravar o desconhecido. Indica que você pode ainda não ter ideia do que encontrará, mas que está disposto(a) a pagar pra ver.",
                image = R.drawable.card_valete_de_paus
            ),
            Card(
                name = "Rainha de Paus",
                description = "A Rainha das Paus significa um momento com mais foco e determinação para alcançar objetivos ou resolver situações. A carta indica amor e paixão, tanto para resolver questões quanto pelo próximo. É uma carta que sugere coragem e força para perseguir o que você deseja no momento. Outra leitura sugere uma mulher que pode te ajudar em um momento que você precisa, reestabelecendo a paz e a harmonia.",
                image = R.drawable.card_rainha_de_paus
            ),
            Card(
                name = "Rei de Paus",
                description = "O Rei de Paus significa basicamente o poder de decisão. Pode representar alguém em uma posição de poder, um chefe, pai ou outra figura em sua vida, ou ainda que você está nessa posição de poder no momento e através da determinação e coragem pode alcançar o sucesso desejado em alguma situação.",
                image = R.drawable.card_rei_de_paus
            ),
            Card(
                name = "Ás de Espadas",
                description = "O Ás de Espadas indica que você pode perceber as coisas com mais clareza, que sua mente pode estar mais aguçada e só falta a coragem para agir. A carta sugere novos começos ou um período de total clareza mental. Lembre-se de que com grandes poderes, vêm grandes responsabilidades. Cuidado para não machucar outras pessoas com excessos de sinceridade e a brutalidade de sua razão ante a uma falta de emoção.",
                image = R.drawable.card_as_de_espadas
            ),
            Card(
                name = "Dois de Espadas",
                description = "O 2 de Espadas significa um distanciamento. Sugere um conflito interno, onde você pode estar querendo se afastar da correria. O problema é se tornar muito isolado(a), se fechando para todos à sua volta. Estar na defensiva é uma coisa, mas erguer barreiras intransponíveis pode significar um rompimento com a realidade.",
                image = R.drawable.card_dois_de_espadas
            ),
            Card(
                name = "Três de Espadas",
                description = "O 3 de Espadas geralmente significa algo doloroso em sua vida. Seu coração pode estar partido por conta de alguma situação ou de alguém. É necessário encontrar o equilíbrio em meio à tristeza para poder voltar a uma frequência positiva. Não seja vítima das injustiças, a vida às vezes bate forte, mas sempre temos o poder de nos levantar. Sugere que você deve ser honesto(a) com você mesmo(a) e parar de se enganar. Use o poder do seu intelecto e da razão, é a hora de dar a volta por cima e recomeçar.",
                image = R.drawable.card_tres_de_espadas
            ),
            Card(
                name = "Quadro de Espadas",
                description = "O 4 de Espadas indica um conflito. Pode ser um conflito interno ou externo, mas a carta sugere que você deve se isolar da situação em questão para descansar e refletir um pouco. Seja uma perda sofrida ou uma decisão importante para tomar, recupere as energias para deixar a tristeza para trás e seguir em frente. Caso você tenha que decidir entre alguma coisa, analise bem a situação antes de tomar sua decisão.",
                image = R.drawable.card_quatro_de_espadas
            ),
            Card(
                name = "Cinco de Espadas",
                description = "O 5 de Espadas indica um momento conturbado, onde pode faltar autoconfiança e sobrar negatividade na atual questão. Muitas vezes a carta sugere problemas no relacionamento, no trabalho ou em alguma outra área da sua vida, com desentendimentos que podem gerar discussões. Mesmo vencendo, sua vitória não parece tão saborosa. Palavras machucam e o resultado final pode ser triste ou doloroso.",
                image = R.drawable.card_cinco_de_espadas
            ),
            Card(
                name = "Seis de Espadas",
                description = "O 6 de Espadas significa um momento de transição, que tende a ser positiva. Esta transição pode ser física, emocional ou espiritual, dependendo da situação. No caso de bagagem emocional que você ainda carrega, a carta sugere que está na hora de deixá-la para trás e seguir em frente. A carta também indica que algum problema que possa estar ocorrendo vai ser solucionado, ou alguém deixará de te incomodar.",
                image = R.drawable.card_seis_de_espadas
            ),
            Card(
                name = "Sete de Espadas",
                description = "O 7 de Espadas significa que a mentira está em jogo. Alguém pode estar mentindo para você ou tentando te enganar. Ou ainda, você pode ter criado uma teia de mentiras como desculpa para não encarar a realidade ou a situação em questão. Você precisa ser honesto(a) consigo mesmo(a) no momento, admitindo seus sentimentos e desejos.",
                image = R.drawable.card_sete_de_espadas
            ),
            Card(
                name = "Oito de Espadas",
                description = "O 8 de Espadas significa obstáculos, sofrimento ou tristeza. Pode ser até por conta de algo menos importante ou pode ser que alguém esteja te fazendo sofrer. De qualquer forma, a carta não traz boas notícias, mas sim uma mensagem de que a sorte pode não te favorecer no momento. Geralmente não é nada que mudará sua vida drasticamente, lembre-se de que você pode superar qualquer situação.",
                image = R.drawable.card_oito_de_espadas
            ),
            Card(
                name = "Nove de Espadas",
                description = "O 9 de Espadas significa uma carga negativa ou difícil em torno da questão mentalizada ou em seu caminho. A carta sugere que você pode estar atravessando ou atravessará uma fase angustiante e serve como um lembrete de que às vezes passamos por fases estressantes ou por tormentos que parecem intermináveis. Porém, nada dura para sempre.",
                image = R.drawable.card_nove_de_espadas
            ),
            Card(
                name = "Dez de Espadas",
                description = "O 10 de Espadas significa que algo chegou ou está chegando ao fim. A carta pode envolver traição, dor, decepção ou desgosto. Geralmente sugere uma perda real, mas sua mensagem é que enquanto uma porta se fecha para sempre, outra se abre. Passamos por momentos difíceis em nossa jornada e eles servem de aprendizado, porém devemos superar nossas dores e ressentimentos. Sugere que seja o que for, você não se faça de vítima nem fique preso(a) em um ciclo de sofrimento, pois tudo passa.",
                image = R.drawable.card_dez_de_espadas
            ),
            Card(
                name = "Valete de Espadas",
                description = "O Valete de Espadas significa que você deve ter a atenção redobrada. Sugere ter que lidar com uma situação inesperada e rápida, indicando que você terá a força e sabedoria necessárias para superar os desafios. Evite tomar decisões precipitadas, mantenha a cabeça no lugar e aja com inteligência, não com emoção. Esta carta significa também que segredos não durarão muito tempo.",
                image = R.drawable.card_valete_de_espadas
            ),
            Card(
                name = "Cavaleiro de Espadas",
                description = "O Cavaleiro de Espadas significa que alguém pode surgir de repente e de maneira impulsiva na situação em questão ou na sua vida no momento. Você deve ter muita cautela, pois esta pessoa pode ter intenções que não são muito claras, pode agir com manipulação ou dizer algo para te desviar da verdade. A carta sugere algum tipo de ação imprudente, do tipo que não pensa nas consequências de suas ações.",
                image = R.drawable.card_cavaleiro_de_espadas
            ),
            Card(
                name = "Rainha de Espadas",
                description = "A Rainha de Espadas significa geralmente uma mulher mais velha que aparece em sua vida, atrelada à questão atual ou que uma situação está perto de encontrar sua conclusão de maneira racional. A figura da Rainha de Espadas se concentra em questões práticas da vida e pode ser bem fria, porém, é uma energia aconselhadora e justa.",
                image = R.drawable.card_rainha_de_espadas
            ),
            Card(
                name = "Rei de Espadas",
                description = "O Rei de Espadas significa poder intelectual e experiência de vida para lidar com a situação em questão ou o atual momento. Pode ser que sua mente você esteja em um bom momento para resolver as questões de maneira objetiva e racional, ou, através de alguém que exerça o papel de autoridade.",
                image = R.drawable.card_rei_de_espadas
            ),
            Card(
                name = "Ás de Copas",
                description = "O Ás de Copas significa que desejos podem ser realizados no momento, onde além de receber o que almeja, você também poderá se sentir mais pleno(a), em meio a alegria e amor. Pode ser um gesto de gentileza, pode ser um novo relacionamento, ou mesmo um novo passo em sua relação atual ou na questão mentalizada.",
                image = R.drawable.card_as_de_copas
            ),
            Card(
                name = "Dois de Copas",
                description = "O 2 de Copas significa harmonia nos relacionamentos. Sugere que uma parceria tende a ser altamente proveitosa, seja no amor, negócios ou trabalho. É um bom sinal para uma nova sociedade, para começar um relacionamento ou fazer novas amizades. Caso você esteja em um relacionamento, a carta indica muita sintonia e cumplicidade. Pode ser a hora de dar o próximo passo ou avançar na situação questionada.",
                image = R.drawable.card_dois_de_copas
            ),
            Card(
                name = "Três de Copas",
                description = "O 3 de Copas significa que algum evento especial pode acontecer. Pode ser em uma situação diversa em um encontro, em torno da questão mentalizada ou mesmo coisas simples como situações inusitadas com amigos. A energia feminina é forte nessa carta, que também sugere que é um bom momento para acordos, para o amor e para a resolução de problemas ou tensões. Seja como for, bons momentos estão em jogo.",
                image = R.drawable.card_tres_de_copas
            ),
            Card(
                name = "Quatro de Copas",
                description = "O 4 de Copas significa que alguma coisa pode não estar muito bem. Sugere que algum desgosto do passado ou presente pode estar interferindo na sua vida ou na questão atual. O momento é de reflexão, onde você deve mergulhar em seu interior e fazer uma autoanálise a respeito do momento. Assim que compreender melhor o que sente, poderá se libertar e retomar a confiança para prosseguir. Só tome cuidado para não ficar tão envolvido(a) com seu lado emocional a ponto de deixar passar boas oportunidades.",
                image = R.drawable.card_quatro_de_copas
            ),
            Card(
                name = "Cinco de Copas",
                description = "O 5 de Copas significa que pode haver algum desapontamento, porém não é algo que mudará sua vida profundamente. Pode até trazer tristeza, mas indica que esta pode ser superada. Talvez possa ser alguma situação de abandono, decepção ou você pode estar sentindo a falta de algo ou alguém. Pode ser também que ainda não tenha recebido aquela coisa tão esperada ou tomou uma decisão errada.",
                image = R.drawable.card_cinco_de_copas
            ),
            Card(
                name = "Seis de Copas",
                description = "O 6 de Copas significa que você não deve levar tudo tão a sério. Indica que pode ser uma boa hora para relaxar um pouco e aproveitar as boas energias envolvidas. Sugere também ajuda no trabalho e no amor e está envolta a um sentimento de gratidão pelo que a vida deu até agora. Sugere um sentimento de nostalgia, mas não fique muito preso(a) ao passado. As boas lembranças servem como aprendizado e te dão força para seguir em frente.",
                image = R.drawable.card_seis_de_copas
            ),
            Card(
                name = "Sete de Copas",
                description = "O 7 de Copas significa sonhos ou algo que está tentando nos alertar. Assim, preste atenção aos sonhos no momento, pois eles podem conter informações importantes. Ao mesmo tempo, a carta também indica os sonhos que temos na vida. Porém, tome cuidado para não se perder em devaneios. Sonhar é muito bom, mas se não arregaçarmos as mangas, eles nunca se tornarão realidade. Em suma o conselho principal é: não se perca em ilusões.",
                image = R.drawable.card_sete_de_copas
            ),
            Card(
                name = "Oito de Copas",
                description = "O 8 de Copas simboliza perda, porém, que pode ser positiva, pois a carta também carrega ímpetos de mudança em seu cerne. Sendo assim, pode ser que você tenha que se livrar de um peso do passado para dar um novo rumo às coisas relacionadas a questão ou em seu atual momento. Talvez você tenha que aceitar algum término ou ainda pode estar iniciando uma jornada para se conhecer melhor e recomeçar.",
                image = R.drawable.card_oito_de_copas
            ),
            Card(
                name = "Nove de Copas",
                description = "O 9 de Copas significa realização. É uma carta positiva, pois nos avisa que nossos problemas e tristezas não importam e a satisfação está a caminho. Esta carta é portadora da alegria e indica que falta só um pouco para alcançá-la plenamente. Sugere que seus desejos serão alcançados como recompensa dos seus esforços.",
                image = R.drawable.card_nove_de_copas
            ),
            Card(
                name = "Dez de Copas",
                description = "O 10 de Copas significa momentos felizes. Se seu coração deseja algo, sugere que você deve conseguir em breve. A carta também indica o fim de um ciclo, ou seja, você pode finalmente conquistar ou ter conquistado algo, resoluções na questão atual, um amor ou ter dado o próximo passo em seu relacionamento. Se você está enfrentando algum problema, ele pode ser resolvido com um final feliz.",
                image = R.drawable.card_dez_de_copas
            ),
            Card(
                name = "Valete de Copas",
                description = "O Valete de Copas significa que coisas boas estão em jogo no momento. A carta indica energia e entusiasmo, dessa forma, é um bom período para iniciar novos projetos ou prosseguir com a situação em questão. Também pode indicar um novo amor, renovação no relacionamento ou na questão mentalizada. Também sugere que novas amizades e parcerias podem ajudar em nossas empreitadas.",
                image = R.drawable.card_valete_de_copas
            ),
            Card(
                name = "Cavaleiro de Copas",
                description = "O Cavaleiro de Copas significa que uma notícia está chegando até você. Pode ser uma declaração de amor, uma mensagem que acabe com algum desentendimento ou novidades que causem alterações. É um momento propício para refletir e pensar no que você realmente deseja. Se você não estiver bem com alguma questão, poderá se sentir balançado(a). Não se iluda com as oportunidades e possibilidades que aparecerão, pense no que realmente importa e não deixe as emoções te guiarem.",
                image = R.drawable.card_cavaleiro_de_copas
            ),
            Card(
                name = "Rainha de Copas",
                description = "A Rainha de Copas significa um momento de calma e compreensão. A carta pode sugerir uma mulher de destaque em sua vida, que inspira carinho, atenção e ajuda quando você precisa, como uma amiga, chefe ou esposa/companheira. Ou, pode representar você mesmo(a), a compaixão, amor e proteção que dedica a outras pessoas.",
                image = R.drawable.card_rainha_de_copas
            ),
            Card(
                name = "Rei de Copas",
                description = "O Rei de Copas sugere total controle sobre as emoções e um equilíbrio que permite enxergar com clareza qualquer situação, tornando mais possível tomar decisões acertadas. A mensagem que a carta traz é muito positiva. Sugere um momento de compreensão, seja favorecendo seus relacionamentos, seja com seus amigos, familiares, com seu amor ou atrelado à questão mentalizada.",
                image = R.drawable.card_rei_de_copas
            ),
            Card(
                name = "Ás de Ouros",
                description = "O Ás de Ouros traz bons presságios relacionados à carreira, prosperidade e finanças em geral.",
                image = R.drawable.card_as_de_ouros
            ),
            Card(
                name = "Dois de Ouros",
                description = "O 2 de Ouros significa basicamente dualidade. Talvez você precise encontrar o equilíbrio em alguma relação, ou tenha uma escolha para fazer ou dois problemas para resolver. Em uma escala menor, pode significar que você está pode estar envolto a dois afazeres ou decisões.",
                image = R.drawable.card_dois_de_ouros
            ),
            Card(
                name = "Três de Ouros",
                description = "O 3 de Ouros significa que seus dons e talentos estão sendo bem utilizados no momento. Tudo que você fizer com carinho e esmero terá mais chances de render bons frutos. Sendo assim, é um bom período para arregaçar as mangas e contar com a ajuda de outras pessoas, pois trabalho em equipe também está favorecido.",
                image = R.drawable.card_tres_de_ouros
            ),
            Card(
                name = "Quatro de Ouros",
                description = "O 4 de Ouros significa basicamente que, no momento, pode haver um medo ou receio que não lhe permite largar algo ou tomar uma decisão assertiva. Quando esta carta aparece em uma consulta, você pode estar se apegando demais à segurança. E isso não é necessariamente uma coisa ruim, pois às vezes, de fato precisamos manter as coisas próximas ao nosso peito por razões de segurança. O problema é que não podemos deixar de viver, agir e dar atenção às pessoas ou coisas que nos cercam",
                image = R.drawable.card_quatro_de_ouros
            ),
            Card(
                name = "Cinco de Ouros",
                description = "O 5 de Ouros significa algumas dificuldades, principalmente atreladas ao lado financeiro da consulta ou questão. Pode significar também um sentimento de abandono, principalmente em leituras atreladas ao término de um namoro ou casamento. Nesse sentido, não é uma carta muito alegre.",
                image = R.drawable.card_5_de_ouros
            ),
            Card(
                name = "Seis de Ouros",
                description = "O 6 de Ouros significa que alguma situação difícil terá uma melhora. A carta indica um momento de generosidade onde as coisas tendem a voltar aos eixos. Sugere que a harmonia será restaurada e sua vida ou a questão em foco tem tudo para se equilibrar novamente.",
                image = R.drawable.card_seis_de_ouros
            ),
            Card(
                name = "Sete de Ouros",
                description = "O 7 de Ouros significa que você deve parar um pouco e avaliar tudo que conseguiu conquistar até o momento antes de seguir em frente. Avalie os obstáculos que restam ou o que te impede de dar o próximo passo rumo ao seu crescimento. Se você se dedicou em prol de seu objetivo e tomou as decisões corretas até agora, seu empenho trará recompensas.",
                image = R.drawable.card_sete_de_ouros
            ),
            Card(
                name = "Oito de Ouros",
                description = "O 8 de Ouros significa que você está no caminho certo. Qualquer que seja a consulta, todo o empenho que você teve está prestes a dar retorno. Seja no campo profissional, em um relacionamento ou mesmo um projeto pessoal, a mensagem da carta é que você cumpriu todas as etapas e agora há chances de alcançar sua recompensa. A carta versa sobre comprometimento e dedicação, indica que sua mente pode estar focada no objetivo final e sugere que você está quase lá.",
                image = R.drawable.card_oito_de_ouros
            ),
            Card(
                name = "Nove de Ouros",
                description = "O 9 de Ouros significa que você está no caminho certo para o sucesso e que você será recompensado na medida certa do esforço que gastou. Se trabalhou duro até agora, com dedicação e foco, certamente colherá bons frutos. Ouros, símbolo do elemento terra, representa riqueza e abundância, mas não fala apenas do lado material. Pode ser uma riqueza interior ou ainda harmonia em seu relacionamento.",
                image = R.drawable.card_nove_de_ouros
            ),
            Card(
                name = "Dez de Ouros",
                description = "O 10 de Ouros significa a realização de desejos. É o ponto final de um ciclo e não importa sobre qual situação seja a consulta, é uma carta que sugere que tudo dará certo. Em relacionamentos, indica estabilidade, durabilidade e felicidade. A respeito de trabalho e dinheiro, indica solução de problemas e ganhos. A carta indica que você pode estar prestes a conseguir exatamente o que deseja.",
                image = R.drawable.card_dez_de_ouros
            ),
            Card(
                name = "Valete de Ouros",
                description = "O Valete de Ouros significa que você pode encontrar um bom caminho para a resolução da questão atual. Para isso, basta  refletir, ponderar e ser realista. Representa um mensageiro e sugere que em breve você obterá as respostas que procura. A carta ainda pode representar alguém que poderá entrar em sua vida subitamente, seja para ajudar a alcançar objetivos ou interagir com a situação. Também fala sobre a busca de conhecimento superior ou que se deve dar valor a isso no momento.",
                image = R.drawable.card_valete_de_ouros
            ),
            Card(
                name = "Cavaleiro de Ouros",
                description = "O Cavaleiro de Ouros significa basicamente perseverança, esforço e comprometimento para realizar objetivos, mas, ao mesmo tempo, certa insegurança emocional. Indica que o momento é propício para sentir energia e determinação necessárias para completar qualquer tarefa. Também sugere estabilidade e segurança, esforço e responsabilidade.",
                image = R.drawable.card_valete_de_ouros
            ),
            Card(
                name = "Rainha de Ouros",
                description = "A Rainha de Ouros significa o recebimento de uma mensagem ligada a abundância e fertilidade. Sugere que tudo o que você fez até o momento, as decisões que você tomou, o empenho e o trabalho árduo garantiram estabilidade e conforto.",
                image = R.drawable.card_rainha_de_ouros
            ),
            Card(
                name = "Rei de Ouros",
                description = "O Rei de Ouros indica que o sucesso pode estar prestes a chegar. Em consultas mais abrangentes, pode significar uma promoção no trabalho ou uma oportunidade qualquer, onde sua sabedoria e intelecto te guiarão para o caminho certo. Sugere que você está no controle e há confiança envolvida. Sugere disciplina e energia para a realização de desejos.",
                image = R.drawable.card_rei_de_ouros
            ),
            Card(
                name = "O Louco",
                description = "O Louco simboliza novos começos, novas experiências, simboliza o início da jornada. Quando aparece em uma consulta, geralmente indica que está na hora de deixar para trás tudo que empata nossos objetivos, como medos, dúvidas e preocupações, para trilhar novos rumos. A carta sugere que esse novo começo seja empreendido de braços abertos e com alegria.",
                image = R.drawable.card_o_louco
            ),
            Card(
                name = "O Mago",
                description = "A carta O Mago traz a mensagem de que seus talentos e seus próprios dons são as chaves para o seu sucesso em qualquer situação questionada. É como se você tivesse todas as ferramentas que precisa bem na sua frente para garantir que o sucesso potencial se manifeste.",
                image = R.drawable.card_o_mago
            ),
            Card(
                name = "A Sacerdotisa",
                description = "A Sacerdotisa é um lembrete de que não temos como saber de tudo acerca de uma situação. Indica que ou não recebemos todos os fatos, ou não enxergamos todos os fatos ou outras pessoas podem estar retendo informações importantes. Quando esta carta aparece, indica segredos e que é melhor procurar pelas respostas.",
                image = R.drawable.card_a_sacerdotisa
            ),
            Card(
                name = "A Imperatriz",
                description = "A Imperatriz indica que as coisas vão bem na situação questionada, como se cada coisa estivesse em seu devido lugar, exatamente como desejado. Também pode trazer informações sobre o tema Mãe, seja sobre você no papel de mãe, sobre uma figura materna em sua vida ou na situação em questão. A Imperatriz é uma figura poderosa e muito segura de si. Sugere proteção e não questiona as decisões. Esta carta geralmente indica um bom presságio, assim como realização e sucesso.",
                image = R.drawable.card_a_imperatriz
            ),
            Card(
                name = "O Imperador",
                description = "O imperador sugere que você está prestes a alcançar seus objetivos ou está no caminho certo. A conexão com Áries também tem a ver com liderança, controle e realização, ou seja, às vezes sugere que você assumirá um papel de líder ou controlará um problema.",
                image = R.drawable.card_o_imperador
            ),
            Card(
                name = "O Papa",
                description = "O Papa indica à busca de conselhos sábios. A carta não indica que você deva tomar decisões importantes por conta própria. Pesquisa, estudo e aconselhamento, além de serem formas de fazer as coisas mais tradicionalmente, podem ser o caminho a seguir para resolver a situação em questão. A carta também representa melhora de status, mas que conselhos e assistência de pessoas ou instituições estruturadas são importantes para que isso aconteça.",
                image = R.drawable.card_o_papa
            ),
            Card(
                name = "Os Enamorados",
                description = "Os Enamorados tem a ver com uma importante decisão que deve ser tomada. Quando a situação envolve trabalho ou amor, ela sugere que você siga sua intuição. Se o seu coração está mandando você seguir um caminho, confie em seus instintos. Só não faça as coisas pensando somente em você, pois o tiro pode sair pela culatra. Pense sempre em quem está envolvido, tente fazer o melhor para todos.",
                image = R.drawable.card_enamorados
            ),
            Card(
                name = "O Carro",
                description = "Esta carta tende a anunciar vitórias e sucessos. Porém, diz que nada vem de bandeja. Mesmo com o sucesso batendo à porta, você deve batalhar por ele. Pode significar uma vitória, mas que deve ser merecida. Simboliza o trabalho duro e a dedicação a longo prazo, indicando que o sucesso não vem fácil, ele deve ser conquistado.",
                image = R.drawable.card_o_carro
            ),
            Card(
                name = "A Força",
                description = "A Força representa as melhores características do signo de Leão, como coragem, determinação, resiliência e força, boas chaves para o sucesso. Porém, indica que para realizar seus objetivos, você também precisará de autocontrole para domar seus próprios leões interiores, que podem representar tanto seus conflitos internos quanto os obstáculos que a vida nos impõe.",
                image = R.drawable.card_a_forca
            ),
            Card(
                name = "O Eremita",
                description = "O Eremita significa que precisamos refletir em relação à situação. Às vezes é preciso dar um tempo e se isolar para ponderar e analisar melhor uma questão. Esta pode ser a mensagem que O Eremita traz: a necessidade de dar uma pausa e refletir. Anuncia que pode ser a hora de se afastar e analisar, mergulhar no seu interior em busca das respostas que você precisa no momento.",
                image = R.drawable.card_o_eremita
            ),
            Card(
                name = "A Roda da Fortuna",
                description = "A Roda da Fortuna representa basicamente a colheita daquilo que plantamos. Apesar do seu significado otimista, não sugere prosperidade, sorte e fortuna do nada. Tudo isso está relacionado às ações que você tomou até o momento. Se você preparou o terreno fazendo escolhas sensatas e tocando seus projetos com afinco, seus objetivos serão realizados. Você semeou e regou sua plantação, agora é hora de colher bons frutos.",
                image = R.drawable.card_a_roda_da_fortuna
            ),
            Card(
                name = "A Justiça",
                description = "A carta da Justiça traz a mensagem de que a situação em questão tende a se resolver a seu favor, ou, pelo menos, da forma mais justa possível. Pode ser um assunto da lei, o resultado final de uma situação específica, questões de relacionamento ou outras situações. O significado básico da carta muitas vezes fala sobre decisões equilibradas e justas.",
                image = R.drawable.card_a_justica
            ),
            Card(
                name = "O Enforcado",
                description = "O Enforcado diz que você precisa se desapegar de algo e seguir em frente. Você pode estar se agarrando a algo que não traz satisfação na questão atual.",
                image = R.drawable.card_o_enforcado
            ),
            Card(
                name = "A Morte",
                description = "A carta A Morte pode incutir medo ou receio nos que ainda não compreendem seu significado. De fato, quando pensamos no tema morte, nada de bom vem à mente, porém, o significado desta carta vai muito além do fim derradeiro. Tem a ver com términos, mas também traz consigo a possibilidade de novos começos, mudanças e transformações. A carta deve ser encarada como um símbolo de transição.",
                image = R.drawable.card_a_morte
            ),
            Card(
                name = "A Temperança",
                description = "Temperança é a característica da pessoa que consegue equilibrar suas próprias vontades. Quando a carta aparece em uma consulta, significa basicamente equilíbrio e sugere harmonia para a situação em questão. Como está associada ao signo de Sagitário, o filósofo do Zodíaco, te convida a refletir sobre o panorama das coisas com mais profundidade. Assim, é uma carta que indica mais pensamento do que ação.",
                image = R.drawable.card_a_temperanca
            ),
            Card(
                name = "O Diabo",
                description = "A carta O Diabo é um Arcano Maior que nunca é visto com bons olhos. Mas, assim como A Morte, não é uma carta negativa. Apenas indica que existem lições que você tem que aprender e isso nem sempre é ruim. Sua associação com Capricórnio sugere que você deve tomar o controle da situação em questão, lidando com as coisas de maneira bem pragmática.",
                image = R.drawable.card_o_diabo
            ),
            Card(
                name = "A Torre",
                description = "O significado da carta A Torre tem a ver com mudanças abruptas. Algo pode mudar em relação à situação questionada. Pense em uma estrutura ou fundação que entra em colapso. Um relacionamento, um emprego, uma amizade e em alguns casos, até mesmo estruturas físicas.",
                image = R.drawable.card_a_torre
            ),
            Card(
                name = "A Estrela",
                description = "A Estrela tem um significado extremamente positivo em uma consulta. Quando aparece, indica um momento em que as coisas começam a dar certo. Sugere que conflitos podem ser apaziguados, problemas de saúde curados, dívidas quitadas, separações que viram reuniões, situações que se tornam positivas, enfim, indica paz, prosperidade e harmonia em sua resposta. Às vezes também aponta a ajuda de alguém que agirá como seu protetor.",
                image = R.drawable.card_a_estrela
            ),
            Card(
                name = "A Lua",
                description = "A Lua significa que está na hora de você seguir a sua intuição. Indica segredos, mistérios e ilusões. Se você tem que tomar uma decisão e não tem certeza sobre que caminho tomar, escute seu coração.",
                image = R.drawable.card_a_lua
            ),
            Card(
                name = "O Sol",
                description = "O Sol significa que boas energias estão em jogo. Quando esse Arcano Maior aparece na leitura, traz todo seu brilho para o momento. A carta sugere otimismo e abundância, indicando que o sucesso parece ser inevitável. O Sol traz energia para realizar, nos enche de confiança e ilumina nosso caminho. Qualquer situação em questão recebe seu brilho e pode ser resolvida. Esse Arcano Maior é a própria representação da vida e da luz.",
                image = R.drawable.card_o_sol
            ),
            Card(
                name = "O Julgamento",
                description = "O Julgamento significa que um novo ciclo se inicia. Todo o seu desempenho ou os pormenores da questão serão avaliados e recompensas surgirão. Este Arcano Maior indica que está na hora de você refletir sobre a situação ou sua vida no momento a fim de obter mais consciência e elevação. Você terá uma mente mais clara e obterá as respostas que precisa. É uma carta de renascimento e muitas vezes indica que uma situação desgastada receberá uma injeção de ânimo.",
                image = R.drawable.card_o_julgamento
            ),
            Card(
                name = "O Mundo",
                description = "A carta O Mundo significa que a situação em questão terá um desfecho. Esse Arcano Maior anuncia um novo começo e indica que a mudança é inevitável. As mudanças que ocorrem ou ocorrerão tendem a ser positivas, sugerindo resposta positiva. Simboliza que algo em sua vida ou relacionado à questão perguntada chegará a uma conclusão.",
                image = R.drawable.card_o_mundo
            )

        )
    }
}