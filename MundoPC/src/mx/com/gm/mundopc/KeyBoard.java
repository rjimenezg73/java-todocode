package mx.com.gm.mundopc;


public class KeyBoard extends DispositivoEntrada{
   private final int idKeyBoard;
   private static int contadorKeyBoards;
   
   
   public KeyBoard (String tipoEntrada, String marca) {
      super(tipoEntrada, marca);
      this.idKeyBoard = ++KeyBoard.contadorKeyBoards;
   }

   @Override
   public String toString() {
      return "KeyBoard{" + "idKeyBoard=" + idKeyBoard + ", " + super.toString() + '}';
   }
   
}
