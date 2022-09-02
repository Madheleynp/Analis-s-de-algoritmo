//@autoras Madheleyn Perez, Valentina Espinoza e Ines Rodriguez//
import javax.swing.JOptionPane;

public class JUEGO_TRIQUI{

    public static void main(String[] args) {
        boolean MD = true;
        double contar = 0;
        String matriz[][] = new String[3][3];
        while (MD) {
            //pocision y jugar
            int X, Y;

            X = leerEntero("Digite la posición de la Fila");
            Y = leerEntero("Digite la posciÓn de  la Columna");
            if (matriz[X][Y] == null) {
                String Tablero_del_Triqui = "";
                String val = "X";
                if (contar % 2 == 0) {
                    val = " O ";
                } else {
                    val = " X ";
                }
                matriz[X][Y] = val;
            } else {
                Mostrar("Posición Ocupada ");
            }
            //imprimir tablero
            String tablero = "";
            for (int x = 0; x < 3; x++) {
                tablero += "\n";
                for (int y = 0; y < 3; y++) {
                    tablero += matriz[x][y] + " | ";
                }
            }
            Mostrar(tablero);

            //ganador del juego x            
            if (matriz[0][0] == " X " && matriz[1][0] == " X " && matriz[2][0] == " X ") {
                MD = false;
                Mostrar("El ganador es X");
            } else {
                if (matriz[0][1] == " X " && matriz[1][1] == " X " && matriz[2][1] == " X ") {
                    MD = false;
                    Mostrar("El ganador es X");
                } else {
                    if (matriz[0][2] == " X " && matriz[1][2] == " X " && matriz[2][2] == " X ") {
                        MD = false;
                        Mostrar("El ganador es X");
                    } else {
                        if (matriz[0][0] == " X " && matriz[0][1] == " X " && matriz[0][2] == " X ") {
                            MD = false;
                            Mostrar("El ganador es X");
                        } else {
                            if (matriz[1][0] == " X " && matriz[1][1] == " X " && matriz[1][2] == " X ") {
                                MD = false;
                                Mostrar("El ganador es X");
                            } else {
                                if (matriz[2][0] == " X " && matriz[2][1] == " X " && matriz[2][2] == " X ") {
                                    MD = false;
                                    Mostrar("El ganador es X");
                                } else {
                                    if (matriz[0][0] == " X " && matriz[1][1] == " X " && matriz[2][2] == " X ") {
                                        MD = false;
                                        Mostrar("El ganador es X");
                                    } else {
                                        if (matriz[2][0] == " X " && matriz[1][1] == " X " && matriz[0][2] == " X ") {
                                            MD = false;
                                            Mostrar("El ganador es X");
                                        } else {
                                            MD = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (matriz[0][0] == " O " && matriz[1][0] == " O " && matriz[2][0] == " O ") {
                MD = false;
                Mostrar(" El ganador es O");
            } else {
                if (matriz[0][1] == " O " && matriz[1][1] == " O " && matriz[2][1] == " O ") {
                    MD = false;
                    Mostrar(" El ganador es O");
                } else {
                    if (matriz[0][2] == " O " && matriz[1][2] == " O " && matriz[2][2] == " O ") {
                        MD = false;
                        Mostrar(" El ganador es O");
                    } else {
                        if (matriz[0][0] == " O " && matriz[0][1] == " O " && matriz[0][2] == " O ") {
                            MD = false;
                            Mostrar(" El ganador es O");
                        } else {
                            if (matriz[1][0] == " O " && matriz[1][1] == " O " && matriz[1][2] == " O ") {
                                MD = false;
                                Mostrar(" El ganador es O");
                            } else {
                                if (matriz[2][0] == " O " && matriz[2][1] == " O " && matriz[2][2] == " O ") {
                                    MD = false;
                                    Mostrar(" El ganador es O");
                                } else {
                                    if (matriz[0][0] == " O " && matriz[1][1] == " O " && matriz[2][2] == " O ") {
                                        MD = false;
                                        Mostrar(" El ganador es O");
                                    } else {
                                        if (matriz[2][0] == " O " && matriz[1][1] == " O " && matriz[0][2] == " O ") {
                                            MD = false;
                                            Mostrar(" El ganador es O");
                                        } else {
                                            MD = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }        
            int co = 0;
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {

                    if (matriz[x][y] != null) {
                        co += 1;
                    }
                }
            }
            if (co == 9) {
                MD = false;
                Mostrar("El tablero finalizo, puesto a que está lleno");
            }
            contar++;
        }
       
    }
    

    static String leerString(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    static int leerEntero(String texto) {
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }

    static void Mostrar(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

}