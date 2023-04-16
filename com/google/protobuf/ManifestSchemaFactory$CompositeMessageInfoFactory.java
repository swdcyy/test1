package com.google.protobuf.ManifestSchemaFactory$CompositeMessageInfoFactory;
import com.google.protobuf.MessageInfoFactory;
import java.lang.Object;
import java.lang.Class;
import com.google.protobuf.MessageInfo;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.String;

public class ManifestSchemaFactory$CompositeMessageInfoFactory implements MessageInfoFactory	// class@00046f
{
    public MessageInfoFactory[] factories;

    public void ManifestSchemaFactory$CompositeMessageInfoFactory(MessageInfoFactory[] p0){
       super();
       this.factories = p0;
    }
    public boolean isSupported(Class p0){
       ManifestSchemaFactory$CompositeMessageInfoFactory tuCompositeM = this.factories;
       int len = tuCompositeM.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (tuCompositeM[i].isSupported(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public MessageInfo messageInfoFor(Class p0){
       object oobject;
       ManifestSchemaFactory$CompositeMessageInfoFactory tuCompositeM = this.factories;
       int len = tuCompositeM.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new UnsupportedOperationException("No factory is available for message type: "+p0.getName());
          }
          oobject = tuCompositeM[i];
          if (oobject.isSupported(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject.messageInfoFor(p0);
    }
}
