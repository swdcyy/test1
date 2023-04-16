package com.yxcorp.gifshow.model.MultiplePhotosProject$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class MultiplePhotosProject$Type extends Enum	// class@001e5a
{
    public int value;
    public static final MultiplePhotosProject$Type[] $VALUES;
    public static final MultiplePhotosProject$Type ATLAS;
    public static final MultiplePhotosProject$Type LONGPICTURE;

    static {
       MultiplePhotosProject$Type type = new MultiplePhotosProject$Type("ATLAS", 0, 1);
       MultiplePhotosProject$Type.ATLAS = type;
       MultiplePhotosProject$Type type1 = new MultiplePhotosProject$Type("LONGPICTURE", 1, 2);
       MultiplePhotosProject$Type.LONGPICTURE = type1;
       MultiplePhotosProject$Type[] typeArray = new MultiplePhotosProject$Type[]{type,type1};
       MultiplePhotosProject$Type.$VALUES = typeArray;
    }
    public void MultiplePhotosProject$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static MultiplePhotosProject$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MultiplePhotosProject$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MultiplePhotosProject$Type.class, p0);
    }
    public static MultiplePhotosProject$Type valueOfInt(int p0){
       MultiplePhotosProject$Type[] obj;
       object oobject;
       MultiplePhotosProject$Type type = MultiplePhotosProject$Type.class;
       if (PatchProxy.isSupport(type)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, type, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = MultiplePhotosProject$Type.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return MultiplePhotosProject$Type.ATLAS;
          }
          oobject = obj[i];
          if (p0 == oobject.getValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static MultiplePhotosProject$Type[] values(){
       Object obj = PatchProxy.apply(null, null, MultiplePhotosProject$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MultiplePhotosProject$Type.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
