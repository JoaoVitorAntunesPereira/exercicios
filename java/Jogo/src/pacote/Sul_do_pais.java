package pacote;

import java.util.Scanner;

public class Sul_do_pais {
    Scanner Scan = new Scanner(System.in);
    int escolha;
    String nada;
    public void inicio_sul_do_pais(){
    	Main.inicio.espaco();
        System.out.println("Então vocês seguem para o sul do pais");
        System.out.println("Você então dirige em caminho à cidade mais ao sul do país, mas você não está se sentindo tão bem e manchas e feridas começam a aprecer pelo seu corpo. Paulo nota que você não está bem");
    	Main.inicio.espaco();
        System.out.println("Você está bem? Pergunta Paulo.");
        System.out.println("1) Sim");
        System.out.println("2) Não");
        escolha = Scan.nextInt();
        if(escolha == 1){
            certeza();
        }else if(escolha == 2){
            if(Main.inventario.suprimentos_medicos == true){
                tomar_remedios();
            }else{
                descansar();
            }
        }else{
            inicio_sul_do_pais();
        }
    }

    public void certeza(){
    	Main.inicio.espaco();
        System.out.println("Você tem certeza? Parece meio pálido");
        if(Main.inventario.suprimentos_medicos == true){
            tomar_remedios();
        }else{
            descansar();
        }
    }

    public void tomar_remedios(){
    	Main.inicio.espaco();
        System.out.println("Quer tomar alguns remédios?");
        System.out.println("1) Sim");
        System.out.println("2) Não");
        escolha = Scan.nextInt();
        if(escolha == 1){
            tomou_remedios();
        }else if(escolha == 2){
            nao_tomar();
        }else{
            tomar_remedios();
        }
    }

    public void tomou_remedios(){
    	Main.inicio.espaco();
        System.out.println("Você então toma alguns remédios e vai para o banco do passageiro descansar enquanto Paulo dirige. Após alguns minutos já se sente um pouco melhor");
        mercado();
    }

    public void nao_tomar(){
    	Main.inicio.espaco();
        System.out.println("Você não toma os remédios e somente vai para o banco de passageiro descansar enquanto Paulo dirige");
        Main.inventario.infeccao_rapida = true;
        mercado();
    }

    public void descansar(){
    	Main.inicio.espaco();
        System.out.println("Você para de dirigir o carro e vai para o banco do carona descansar enquanto Paulo dirige");
        Main.inventario.infeccao_rapida = true;
        mercado();
    }

    public void mercado(){
        System.out.println("Vocês decidem parar em um mercado para pegar algumas coisas para comer enquanto viajam");
        System.out.println("Antes de saírem do carro vocês pegam algumas armas para tentar se protegerem caso tenhha alguém lá dentro");
        System.out.println("Chegando perto da entrada do mercado vocês vêem alguém estranho do outro lado da rua");
        Main.inicio.espaco();
        System.out.println("Paulo -Já faz um tempinho que eu estou pensando nisso, você vai dizer que é loucura mas essa é a única resposta que se encaixa mais no que está acontecendo aqui");
        System.out.println("Pressione enter para continuar.");
        Scan.nextLine();
        System.out.println("Você -Do que que tu ta falando?");
        System.out.println("Paulo -Essas coisa são zumbis!");
        System.out.println("Você -Sinceramente, também acho.");
        System.out.println("Paulo -Sério?");
        System.out.println("Você -Sim, mas agora a gente tem que descobrir o que ta causando isso.");
        System.out.println("Nesse momento em que vocês estão conversando veem uma nave passando pelo céu.");
        System.out.println("Paulo -Aquilo não me parece ser militar, mas se for eles esconderam por um bom tempo essa tecnologia.");
        System.out.println("Após isso vocês entram no mercado para pegar alguma coisa pra comer. Lá vocês veem um zumbi.");
        System.out.println("Já que eles não são mais humanos acho que não tem problema em matar, então Paulo atira nele e vocês pegam algumas coisas e saem do mercado.");
        System.out.println("Vocês entram no carro e seguem o caminho.");
        System.out.println("Depois de um longo caminho vocês chegam na cidade e veem a nave no topo de uma montanha.");
        if(Main.inventario.infeccao_rapida == true){
            passar_mal();
        }else{
            seguir();
        }
    }

    public void passar_mal(){
        System.out.println("Mas você começa a passar mal");
        System.out.println("Paulo -Você está bem? Eu disse pra tomar os remédios.");
        System.out.println("Você -To só um pouco cansado.");
        System.out.println("Paulo -Vem aqui, deixa que eu te ajudo a subir");
        seguir();
    }

    public void seguir(){
        System.out.println("Vocês seguem para a montanha para tentar entrar na nave, parece uma ideia idiota, mas vocês querem respostas");
        System.out.println("Você- Tu não acha estranho que o lugar mais seguro seja justamente onde começou tudo isso?");
        System.out.println("Paulo -Realmente. Não faz sentido, talvez a gente descubra alguma coisa lá dentro");
        System.out.println("Vocês então sobem e entram na nave, lá dentro vocês veem capsulas com água e criaturas dentro delas, algumas aparentemente da Terra e outras que parecem ser de filmes de ficção científica.");
        System.out.println("Então de repente aparece um humanoide e vocês se assustam e se afastam dele.");
        System.out.println("Alien -Por mais que eu tenha começado isso eu quero ajudar vocês.");
        System.out.println("Você -Então tudo isso é culpa sua?");
        System.out.println("Alien -Infelizmente, eu cai no seu planeta devido a eu ter entrado em um buraco negro e ter sido atingido por um meteoro, por iso eu cai aqui.");
        System.out.println("Você -O que você sabe sobre os zumbis.");
        System.out.println("Alien -Zumbis? Então é assim que vocês estão chamando os infectados.");
        System.out.println("Você -Você pode curar eles?");
        System.out.println("Alien -Sim, e você também. Diz ele apontando para você");
        System.out.println("Você -Como assim me curar?");
        System.out.println("Alien -Desde o momento em que eu vi você percebi que estava infectado, você quer que eu te cure?");
        System.out.println("Você -Sim, mas você terá que curar todos os outros.");
        System.out.println("Alien -Você terá que vim comigo então.");
        System.out.println("Você -Mas por que?");
        System.out.println("Alien -Além do seu exército estar atrás de mim eu não ter conhecimento sobre a sua espécie, o que dificulta na criaçao de um antídoto para o vírus.");
        System.out.println("Você -E para onde eu iria com você?");
        System.out.println("Alien -Não precisamos ir tão longe, somente subir longe o suficiente para que eles não me ataquem, e vai ser só por um curto período de tempo já que minha nave está meio danificada.");
    }
}
