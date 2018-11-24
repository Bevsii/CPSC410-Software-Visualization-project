import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PythonAnaliser {
    private String fileLocation;
    private File directory;
    private List<File>  pythonFiles = new ArrayList<File>();

    public PythonAnaliser(String fileLocation) throws Exception {
        this.fileLocation = fileLocation;
        File pythonFolder = new File(fileLocation);

        //Check that folder actually exists, otherwise throw an error
        if(!pythonFolder.exists()){
            throw new Exception("File location not found!");
        }

        for(File pythonFile : pythonFolder.listFiles()){
            // If it is a python file
            if (pythonFile.getName().contains(".py")){
                pythonFiles.add(pythonFile);
            }
        }
    }

    public void StaticAnalysis(File outputFile) throws IOException {
        for(File file : pythonFiles){
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine;

            while (null != (currentLine = reader.readLine())){
                currentLine = currentLine;

            }
        }
    }

    public void DynamicAnalysis(File outputFIle) throws IOException {

    }
}