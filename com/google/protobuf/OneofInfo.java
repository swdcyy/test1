package com.google.protobuf.OneofInfo;
import java.lang.reflect.Field;
import java.lang.Object;

public final class OneofInfo	// class@000493
{
    public final Field caseField;
    public final int id;
    public final Field valueField;

    public void OneofInfo(int p0,Field p1,Field p2){
       super();
       this.id = p0;
       this.caseField = p1;
       this.valueField = p2;
    }
    public Field getCaseField(){
       return this.caseField;
    }
    public int getId(){
       return this.id;
    }
    public Field getValueField(){
       return this.valueField;
    }
}
