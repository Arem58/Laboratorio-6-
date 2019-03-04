public class ReadFile {
    public static iPila readFile(Calculadora calculadora, iPila stack) throws FileNotFoundException, IOException {

        File file = new File("datos.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null){
            stack = calculadora.operar(line, stack);
        }

        return stack;
    }
}
