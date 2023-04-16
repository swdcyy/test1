package com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ObjectMirror$PropertyKind extends Enum	// class@001004
{
    public int index;
    public static final ObjectMirror$PropertyKind[] $VALUES;
    public static final ObjectMirror$PropertyKind Indexed;
    public static final ObjectMirror$PropertyKind Named;

    static {
       ObjectMirror$PropertyKind propertyKind = new ObjectMirror$PropertyKind("Named", 0, 1);
       ObjectMirror$PropertyKind.Named = propertyKind;
       ObjectMirror$PropertyKind propertyKind1 = new ObjectMirror$PropertyKind("Indexed", 1, 2);
       ObjectMirror$PropertyKind.Indexed = propertyKind1;
       ObjectMirror$PropertyKind[] propertyKind2 = new ObjectMirror$PropertyKind[]{propertyKind,propertyKind1};
       ObjectMirror$PropertyKind.$VALUES = propertyKind2;
    }
    public void ObjectMirror$PropertyKind(String p0,int p1,int p2){
       super(p0, p1);
       this.index = p2;
    }
    public static ObjectMirror$PropertyKind valueOf(String p0){
       return Enum.valueOf(ObjectMirror$PropertyKind.class, p0);
    }
    public static ObjectMirror$PropertyKind[] values(){
       return ObjectMirror$PropertyKind.$VALUES.clone();
    }
}
