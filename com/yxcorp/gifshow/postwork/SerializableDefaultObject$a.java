package com.yxcorp.gifshow.postwork.SerializableDefaultObject$a;
import zk.e;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import com.yxcorp.gifshow.postwork.SerializableDefaultObject;

public class SerializableDefaultObject$a implements e	// class@0010bc
{

    public void SerializableDefaultObject$a(){
       super();
    }
    public Object a(Type p0){
       SerializableDefaultObject serializable = PatchProxy.applyOneRefs(p0, this, SerializableDefaultObject$a.class, "1");
       if (serializable != PatchProxyResult.class) {
       }else {
          serializable = new SerializableDefaultObject();
       }
       return serializable;
    }
}
