package com.airbnb.lottie.model.DocumentData$Justification;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DocumentData$Justification extends Enum	// class@000dc1
{
    public static final DocumentData$Justification[] $VALUES;
    public static final DocumentData$Justification CENTER;
    public static final DocumentData$Justification LEFT_ALIGN;
    public static final DocumentData$Justification RIGHT_ALIGN;

    static {
       DocumentData$Justification justificatio = new DocumentData$Justification("LEFT_ALIGN", 0);
       DocumentData$Justification.LEFT_ALIGN = justificatio;
       DocumentData$Justification justificatio1 = new DocumentData$Justification("RIGHT_ALIGN", 1);
       DocumentData$Justification.RIGHT_ALIGN = justificatio1;
       DocumentData$Justification justificatio2 = new DocumentData$Justification("CENTER", 2);
       DocumentData$Justification.CENTER = justificatio2;
       DocumentData$Justification[] justificatio3 = new DocumentData$Justification[]{justificatio,justificatio1,justificatio2};
       DocumentData$Justification.$VALUES = justificatio3;
    }
    public void DocumentData$Justification(String p0,int p1){
       super(p0, p1);
    }
    public static DocumentData$Justification valueOf(String p0){
       return Enum.valueOf(DocumentData$Justification.class, p0);
    }
    public static DocumentData$Justification[] values(){
       return DocumentData$Justification.$VALUES.clone();
    }
}
