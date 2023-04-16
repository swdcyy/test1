package com.google.protobuf.ManifestSchemaFactory;
import com.google.protobuf.SchemaFactory;
import com.google.protobuf.ManifestSchemaFactory$1;
import com.google.protobuf.MessageInfoFactory;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.Internal;
import com.google.protobuf.ManifestSchemaFactory$CompositeMessageInfoFactory;
import com.google.protobuf.GeneratedMessageInfoFactory;
import java.lang.Class;
import java.lang.reflect.Method;
import com.google.protobuf.MessageInfo;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.Schema;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.NewInstanceSchema;
import com.google.protobuf.NewInstanceSchemas;
import com.google.protobuf.ListFieldSchema;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.SchemaUtil;
import com.google.protobuf.ExtensionSchema;
import com.google.protobuf.ExtensionSchemas;
import com.google.protobuf.MapFieldSchema;
import com.google.protobuf.MapFieldSchemas;
import com.google.protobuf.MessageSchema;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageSetSchema;

public final class ManifestSchemaFactory implements SchemaFactory	// class@000470
{
    public final MessageInfoFactory messageInfoFactory;
    public static final MessageInfoFactory EMPTY_FACTORY;

    static {
       ManifestSchemaFactory.EMPTY_FACTORY = new ManifestSchemaFactory$1();
    }
    public void ManifestSchemaFactory(){
       super(ManifestSchemaFactory.getDefaultMessageInfoFactory());
    }
    public void ManifestSchemaFactory(MessageInfoFactory p0){
       super();
       this.messageInfoFactory = Internal.checkNotNull(p0, "messageInfoFactory");
    }
    public static MessageInfoFactory getDefaultMessageInfoFactory(){
       MessageInfoFactory[] messageInfoF = new MessageInfoFactory[]{GeneratedMessageInfoFactory.getInstance(),ManifestSchemaFactory.getDescriptorMessageInfoFactory()};
       return new ManifestSchemaFactory$CompositeMessageInfoFactory(messageInfoF);
    }
    public static MessageInfoFactory getDescriptorMessageInfoFactory(){
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", uClassArray).invoke(null, objArray);
       }catch(java.lang.Exception e0){
          return ManifestSchemaFactory.EMPTY_FACTORY;
       }
    }
    public static boolean isProto2(MessageInfo p0){
       boolean b = (p0.getSyntax() == ProtoSyntax.PROTO2)? true: false;
       return b;
    }
    public static Schema newSchema(Class p0,MessageInfo p1){
       MessageSchema messageSchem;
       if (GeneratedMessageLite.class.isAssignableFrom(p0)) {
          messageSchem = (ManifestSchemaFactory.isProto2(p1))? MessageSchema.newSchema(p0, p1, NewInstanceSchemas.lite(), ListFieldSchema.lite(), SchemaUtil.unknownFieldSetLiteSchema(), ExtensionSchemas.lite(), MapFieldSchemas.lite()): MessageSchema.newSchema(p0, p1, NewInstanceSchemas.lite(), ListFieldSchema.lite(), SchemaUtil.unknownFieldSetLiteSchema(), null, MapFieldSchemas.lite());
          return messageSchem;
       }else if(ManifestSchemaFactory.isProto2(p1)){
          messageSchem = MessageSchema.newSchema(p0, p1, NewInstanceSchemas.full(), ListFieldSchema.full(), SchemaUtil.proto2UnknownFieldSetSchema(), ExtensionSchemas.full(), MapFieldSchemas.full());
       }else {
          messageSchem = MessageSchema.newSchema(p0, p1, NewInstanceSchemas.full(), ListFieldSchema.full(), SchemaUtil.proto3UnknownFieldSetSchema(), null, MapFieldSchemas.full());
       }
       return messageSchem;
    }
    public Schema createSchema(Class p0){
       SchemaUtil.requireGeneratedMessage(p0);
       MessageInfo messageInfo = this.messageInfoFactory.messageInfoFor(p0);
       if (!messageInfo.isMessageSetWireFormat()) {
          return ManifestSchemaFactory.newSchema(p0, messageInfo);
       }
       if (GeneratedMessageLite.class.isAssignableFrom(p0)) {
          return MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetLiteSchema(), ExtensionSchemas.lite(), messageInfo.getDefaultInstance());
       }
       return MessageSetSchema.newSchema(SchemaUtil.proto2UnknownFieldSetSchema(), ExtensionSchemas.full(), messageInfo.getDefaultInstance());
    }
}
