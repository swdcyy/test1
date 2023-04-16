package com.google.protobuf.Protobuf;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.google.protobuf.ManifestSchemaFactory;
import java.util.Collection;
import java.util.concurrent.ConcurrentMap;
import java.util.Iterator;
import com.google.protobuf.Schema;
import com.google.protobuf.MessageSchema;
import com.google.protobuf.Reader;
import com.google.protobuf.ExtensionRegistryLite;
import java.lang.Class;
import java.lang.String;
import com.google.protobuf.Internal;
import com.google.protobuf.SchemaFactory;
import com.google.protobuf.Writer;

public final class Protobuf	// class@00049b
{
    public final ConcurrentMap schemaCache;
    public final SchemaFactory schemaFactory;
    public static final Protobuf INSTANCE;

    static {
       Protobuf.INSTANCE = new Protobuf();
    }
    public void Protobuf(){
       super();
       this.schemaCache = new ConcurrentHashMap();
       this.schemaFactory = new ManifestSchemaFactory();
    }
    public static Protobuf getInstance(){
       return Protobuf.INSTANCE;
    }
    public int getTotalSchemaSize(){
       Iterator iterator = this.schemaCache.values().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Schema schema = iterator.next();
          if (schema instanceof MessageSchema) {
             i = i + schema.getSchemaSize();
          }
       }
       return i;
    }
    public boolean isInitialized(Object p0){
       return this.schemaFor(p0).isInitialized(p0);
    }
    public void makeImmutable(Object p0){
       this.schemaFor(p0).makeImmutable(p0);
    }
    public void mergeFrom(Object p0,Reader p1){
       this.mergeFrom(p0, p1, ExtensionRegistryLite.getEmptyRegistry());
    }
    public void mergeFrom(Object p0,Reader p1,ExtensionRegistryLite p2){
       this.schemaFor(p0).mergeFrom(p0, p1, p2);
    }
    public Schema registerSchema(Class p0,Schema p1){
       Internal.checkNotNull(p0, "messageType");
       Internal.checkNotNull(p1, "schema");
       return this.schemaCache.putIfAbsent(p0, p1);
    }
    public Schema registerSchemaOverride(Class p0,Schema p1){
       Internal.checkNotNull(p0, "messageType");
       Internal.checkNotNull(p1, "schema");
       return this.schemaCache.put(p0, p1);
    }
    public Schema schemaFor(Class p0){
       Internal.checkNotNull(p0, "messageType");
       Schema schema = this.schemaCache.get(p0);
       if (schema == null) {
          schema = this.schemaFactory.createSchema(p0);
          Schema schema1 = this.registerSchema(p0, schema);
          if (schema1 != null) {
             schema = schema1;
          }
       }
       return schema;
    }
    public Schema schemaFor(Object p0){
       return this.schemaFor(p0.getClass());
    }
    public void writeTo(Object p0,Writer p1){
       this.schemaFor(p0).writeTo(p0, p1);
    }
}
