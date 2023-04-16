package com.google.protobuf.GeneratedMessageLite$SerializedForm;
import java.io.Serializable;
import com.google.protobuf.MessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import com.google.protobuf.MessageLite$Builder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.StringBuilder;

public final class GeneratedMessageLite$SerializedForm implements Serializable	// class@00043b
{
    public final byte[] asBytes;
    public final Class messageClass;
    public final String messageClassName;
    public static final long serialVersionUID;

    public void GeneratedMessageLite$SerializedForm(MessageLite p0){
       super();
       Class class = p0.getClass();
       this.messageClass = class;
       this.messageClassName = class.getName();
       this.asBytes = p0.toByteArray();
    }
    public static GeneratedMessageLite$SerializedForm of(MessageLite p0){
       return new GeneratedMessageLite$SerializedForm(p0);
    }
    public Object readResolve(){
       try{
          Field declaredFiel = this.resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
          declaredFiel.setAccessible(true);
          return declaredFiel.get(null).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
       }catch(java.lang.ClassNotFoundException e0){
          throw new RuntimeException("Unable to find proto buffer class: "+this.messageClassName, e0);
       }catch(java.lang.NoSuchFieldException e0){
          return this.readResolveFallback();
       }catch(java.lang.SecurityException e0){
          throw new RuntimeException("Unable to call DEFAULT_INSTANCE in "+this.messageClassName, e0);
       }catch(java.lang.IllegalAccessException e0){
          throw new RuntimeException("Unable to call parsePartialFrom", e0);
       }catch(com.google.protobuf.InvalidProtocolBufferException e0){
          throw new RuntimeException("Unable to understand proto buffer", e0);
       }
    }
    public final Object readResolveFallback(){
       try{
          Field declaredFiel = this.resolveMessageClass().getDeclaredField("defaultInstance");
          declaredFiel.setAccessible(true);
          return declaredFiel.get(null).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
       }catch(java.lang.ClassNotFoundException e0){
          throw new RuntimeException("Unable to find proto buffer class: "+this.messageClassName, e0);
       }catch(java.lang.NoSuchFieldException e0){
          throw new RuntimeException("Unable to find defaultInstance in "+this.messageClassName, e0);
       }catch(java.lang.SecurityException e0){
          throw new RuntimeException("Unable to call defaultInstance in "+this.messageClassName, e0);
       }catch(java.lang.IllegalAccessException e0){
          throw new RuntimeException("Unable to call parsePartialFrom", e0);
       }catch(com.google.protobuf.InvalidProtocolBufferException e0){
          throw new RuntimeException("Unable to understand proto buffer", e0);
       }
    }
    public final Class resolveMessageClass(){
       GeneratedMessageLite$SerializedForm tmessageClas = this.messageClass;
       if (tmessageClas != null) {
       }else {
          tmessageClas = Class.forName(this.messageClassName);
       }
       return tmessageClas;
    }
}
