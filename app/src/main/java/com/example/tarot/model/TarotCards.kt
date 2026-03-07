package com.example.tarot.model

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
            

        )
    }
}