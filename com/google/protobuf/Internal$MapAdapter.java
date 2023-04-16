package com.google.protobuf.Internal$MapAdapter;
import java.util.AbstractMap;
import java.util.Map;
import com.google.protobuf.Internal$MapAdapter$Converter;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$MapAdapter$1;
import java.util.Set;
import com.google.protobuf.Internal$MapAdapter$SetAdapter;
import java.lang.Object;

public class Internal$MapAdapter extends AbstractMap	// class@000455
{
    public final Map realMap;
    public final Internal$MapAdapter$Converter valueConverter;

    public void Internal$MapAdapter(Map p0,Internal$MapAdapter$Converter p1){
       super();
       this.realMap = p0;
       this.valueConverter = p1;
    }
    public static Internal$MapAdapter$Converter newEnumConverter(Internal$EnumLiteMap p0,Internal$EnumLite p1){
       return new Internal$MapAdapter$1(p0, p1);
    }
    public Set entrySet(){
       return new Internal$MapAdapter$SetAdapter(this, this.realMap.entrySet());
    }
    public Object get(Object p0){
       p0 = this.realMap.get(p0);
       if (p0 == null) {
          return null;
       }
       return this.valueConverter.doForward(p0);
    }
    public Object put(Object p0,Object p1){
       p0 = this.realMap.put(p0, this.valueConverter.doBackward(p1));
       if (p0 == null) {
          return null;
       }
       return this.valueConverter.doForward(p0);
    }
}
