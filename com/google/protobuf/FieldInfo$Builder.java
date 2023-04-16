package com.google.protobuf.FieldInfo$Builder;
import java.lang.Object;
import com.google.protobuf.FieldInfo$1;
import com.google.protobuf.FieldInfo;
import com.google.protobuf.FieldType;
import com.google.protobuf.OneofInfo;
import java.lang.Class;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.reflect.Field;
import java.lang.IllegalStateException;
import java.lang.String;
import com.google.protobuf.Internal;

public final class FieldInfo$Builder	// class@00041c
{
    public Field cachedSizeField;
    public boolean enforceUtf8;
    public Internal$EnumVerifier enumVerifier;
    public Field field;
    public int fieldNumber;
    public Object mapDefaultEntry;
    public OneofInfo oneof;
    public Class oneofStoredType;
    public Field presenceField;
    public int presenceMask;
    public boolean required;
    public FieldType type;

    public void FieldInfo$Builder(){
       super();
    }
    public void FieldInfo$Builder(FieldInfo$1 p0){
       super();
    }
    public FieldInfo build(){
       FieldInfo$Builder toneof = this.oneof;
       if (toneof != null) {
          return FieldInfo.forOneofMemberField(this.fieldNumber, this.type, toneof, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
       }
       FieldInfo$Builder tmapDefaultE = this.mapDefaultEntry;
       if (tmapDefaultE != null) {
          return FieldInfo.forMapField(this.field, this.fieldNumber, tmapDefaultE, this.enumVerifier);
       }
       FieldInfo$Builder tpresenceFie = this.presenceField;
       if (tpresenceFie != null) {
          if (this.required != null) {
             return FieldInfo.forProto2RequiredField(this.field, this.fieldNumber, this.type, tpresenceFie, this.presenceMask, this.enforceUtf8, this.enumVerifier);
          }
          return FieldInfo.forProto2OptionalField(this.field, this.fieldNumber, this.type, tpresenceFie, this.presenceMask, this.enforceUtf8, this.enumVerifier);
       }else {
          tmapDefaultE = this.enumVerifier;
          if (tmapDefaultE != null) {
             FieldInfo$Builder tcachedSizeF = this.cachedSizeField;
             if (tcachedSizeF == null) {
                return FieldInfo.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, tmapDefaultE);
             }
             return FieldInfo.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, tmapDefaultE, tcachedSizeF);
          }else {
             tmapDefaultE = this.cachedSizeField;
             if (tmapDefaultE == null) {
                return FieldInfo.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8);
             }
             return FieldInfo.forPackedField(this.field, this.fieldNumber, this.type, tmapDefaultE);
          }
       }
    }
    public FieldInfo$Builder withCachedSizeField(Field p0){
       this.cachedSizeField = p0;
       return this;
    }
    public FieldInfo$Builder withEnforceUtf8(boolean p0){
       this.enforceUtf8 = p0;
       return this;
    }
    public FieldInfo$Builder withEnumVerifier(Internal$EnumVerifier p0){
       this.enumVerifier = p0;
       return this;
    }
    public FieldInfo$Builder withField(Field p0){
       if (this.oneof != null) {
          throw new IllegalStateException("Cannot set field when building a oneof.");
       }
       this.field = p0;
       return this;
    }
    public FieldInfo$Builder withFieldNumber(int p0){
       this.fieldNumber = p0;
       return this;
    }
    public FieldInfo$Builder withMapDefaultEntry(Object p0){
       this.mapDefaultEntry = p0;
       return this;
    }
    public FieldInfo$Builder withOneof(OneofInfo p0,Class p1){
       if (this.field != null || this.presenceField != null) {
          throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
       }
       this.oneof = p0;
       this.oneofStoredType = p1;
       return this;
    }
    public FieldInfo$Builder withPresence(Field p0,int p1){
       this.presenceField = Internal.checkNotNull(p0, "presenceField");
       this.presenceMask = p1;
       return this;
    }
    public FieldInfo$Builder withRequired(boolean p0){
       this.required = p0;
       return this;
    }
    public FieldInfo$Builder withType(FieldType p0){
       this.type = p0;
       return this;
    }
}
