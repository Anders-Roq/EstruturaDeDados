package Arrays.Projeto02;
import java.util.Scanner;


public class Estoque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("**Vamos cadastrar os itens do estoque**");

        System.out.println("Digite a quantidade total de itens que existe no estoque");
        int quantidade = scan.nextInt();
        scan.nextLine();

        String[] NomeProdutos = new String[quantidade];
        int[] QuantiaProdutos = new int[quantidade];


        for (int i = 0; i < quantidade; i++) {
            System.out.println("O nome do " + (i + 1) + "º produto: ");
            NomeProdutos[i] = scan.nextLine();

            System.out.println("A quantidade desse produto em unidades: ");
            QuantiaProdutos[i] = scan.nextInt();
            scan.nextLine();

        }

        //Menu

        boolean continuar = true;

        while (continuar) {
            System.out.println("************************************************");
            System.out.println("Bem Vindo ao Sistema de Gerenciamento de Estoque");
            System.out.println("Digite a opção que voce deseja acessar");
            System.out.println("1: Atualizar Quantidade");
            System.out.println("2: Exibir Estoque");
            System.out.println("3: Pesquisar Produtos");
            System.out.println("4: Sair");
            System.out.println("***************************************************");

            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Atualizar");
                    System.out.println("Digite nome do item que deseja mudar a quantidade");
                    String pesquisar = scan.next();

                    boolean encontrar = false;

                    for (int i = 0; i < quantidade; i++) {
                        if (NomeProdutos[i].equalsIgnoreCase(pesquisar)) {
                            System.out.println("Digite a nova quantidade");
                            QuantiaProdutos[i] = scan.nextInt();
                            System.out.println("*Nova quantidade*");
                            System.out.println("Item: " + NomeProdutos[i] + " Quantidade: " + QuantiaProdutos[i]);
                            encontrar = true;
                            break;
                        }

                    }
                    if (!encontrar) {
                        System.out.println("Produto " + pesquisar + " Não Existe");
                    }
                    break;


                case 2:
                    System.out.println("**Produtos no Estoque**");
                    for (int j = 0; j < quantidade; j++) {
                        System.out.println("Nome do produto: " + NomeProdutos[j] +" "+
                                "\nQuantidade do produto em unidades: " + QuantiaProdutos[j] + "\n");
                    }
                    break;

                case 3:
                    System.out.println("Digite o Item que Deseja Pesquisar");
                    String pesquisa = scan.next();

                    boolean encontrado = false;

                    for (int i = 0; i < quantidade; i++) {
                        if (NomeProdutos[i].equalsIgnoreCase(pesquisa)) {
                            System.out.println("Item encontrado: " + NomeProdutos[i] + " ,quantidade: " + QuantiaProdutos[i]);
                            encontrado = true;
                            break;
                        }

                    }
                    if (!encontrado) {
                        System.out.println("Produto " + pesquisa + " Não Existe");
                    }
                    break;

                case 4:
                    System.out.println("Sair do Menu");
                    continuar=false;
                    break;

            }

        }
        scan.close();
    }
}
