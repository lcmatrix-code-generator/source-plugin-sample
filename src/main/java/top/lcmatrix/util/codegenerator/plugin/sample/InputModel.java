package top.lcmatrix.util.codegenerator.plugin.sample;

import top.lcmatrix.util.codegenerator.common.plugin.InputField;

import java.io.File;
import java.util.List;

public class InputModel {

    private String textField;

    @InputField(label = "Please enter some text")
    private String textFieldSpecifyLabel;

    @InputField(label = "a required text filed", required = true)
    private String textFieldRequired;

    @InputField(label = "a checked checkbox", defaultValue = "true")
    private boolean fieldWithDefaultValue;

    @InputField(label = "validate email", validateRegExp = "^.+@.+$")
    private String email;

    @InputField(label = "password", mask = true)
    private String password;

    @InputField(label = "a zip file",
     fileSelectionMode = InputField.FILE_SELECTION_MODE_FILES_ONLY, allowFileSuffixes = ".zip")
    private File zipFile;

    @InputField(label = "a directory",
            fileSelectionMode = InputField.FILE_SELECTION_MODE_DIRECTORIES_ONLY)
    private File directory;

    private List<File> someFiles;

    private SelectableEnum animal;

    @InputField(label = "select some animals", defaultValue = "DOG,CAT")
    private List<SelectableEnum> animals;

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public String getTextFieldSpecifyLabel() {
        return textFieldSpecifyLabel;
    }

    public void setTextFieldSpecifyLabel(String textFieldSpecifyLabel) {
        this.textFieldSpecifyLabel = textFieldSpecifyLabel;
    }

    public String getTextFieldRequired() {
        return textFieldRequired;
    }

    public void setTextFieldRequired(String textFieldRequired) {
        this.textFieldRequired = textFieldRequired;
    }

    public boolean isFieldWithDefaultValue() {
        return fieldWithDefaultValue;
    }

    public void setFieldWithDefaultValue(boolean fieldWithDefaultValue) {
        this.fieldWithDefaultValue = fieldWithDefaultValue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public File getZipFile() {
        return zipFile;
    }

    public void setZipFile(File zipFile) {
        this.zipFile = zipFile;
    }

    public File getDirectory() {
        return directory;
    }

    public void setDirectory(File directory) {
        this.directory = directory;
    }

    public List<File> getSomeFiles() {
        return someFiles;
    }

    public void setSomeFiles(List<File> someFiles) {
        this.someFiles = someFiles;
    }

    public SelectableEnum getAnimal() {
        return animal;
    }

    public void setAnimal(SelectableEnum animal) {
        this.animal = animal;
    }

    public List<SelectableEnum> getAnimals() {
        return animals;
    }

    public void setAnimals(List<SelectableEnum> animals) {
        this.animals = animals;
    }
}
