package top.lcmatrix.util.codegenerator.plugin.sample;

import top.lcmatrix.util.codegenerator.common.plugin.ISelectableEnum;

public enum SelectableEnum implements ISelectableEnum {
    DOG("dog"), CAT("cat"), PIG("pig"), COW("cow"), SHEEP("sheep"), HORSE("horse");

    private String displayText;
    SelectableEnum(String displayText){
        this.displayText = displayText;
    }

    @Override
    public String getDisplayText() {
        return displayText;
    }
}
