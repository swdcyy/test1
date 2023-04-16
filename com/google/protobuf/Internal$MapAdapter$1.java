package com.google.protobuf.Internal$MapAdapter$1;
import com.google.protobuf.Internal$MapAdapter$Converter;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Object;
import java.lang.Integer;

public final class Internal$MapAdapter$1 implements Internal$MapAdapter$Converter	// class@000450
{
    public final Internal$EnumLiteMap val$enumMap;
    public final Internal$EnumLite val$unrecognizedValue;

    public void Internal$MapAdapter$1(Internal$EnumLiteMap p0,Internal$EnumLite p1){
       this.val$enumMap = p0;
       this.val$unrecognizedValue = p1;
       super();
    }
    public Integer doBackward(Internal$EnumLite p0){
       return Integer.valueOf(p0.getNumber());
    }
    public Object doBackward(Object p0){
       return this.doBackward(p0);
    }
    public Internal$EnumLite doForward(Integer p0){
       Internal$EnumLite uEnumLite = this.val$enumMap.findValueByNumber(p0.intValue());
       if (uEnumLite == null) {
          uEnumLite = this.val$unrecognizedValue;
       }
       return uEnumLite;
    }
    public Object doForward(Object p0){
       return this.doForward(p0);
    }
}
