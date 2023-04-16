package cn.vimfung.luascriptcore.LuaValue;
import cn.vimfung.luascriptcore.LuaBaseObject;
import cn.vimfung.luascriptcore.LuaFunction;
import cn.vimfung.luascriptcore.LuaPointer;
import cn.vimfung.luascriptcore.LuaTuple;
import com.kwai.eve.blockdata.BlockData;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Float;
import java.lang.Byte;
import cn.vimfung.luascriptcore.LuaValueType;
import cn.vimfung.luascriptcore.LuaContext;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import java.lang.Character;
import java.lang.Short;
import java.util.ArrayList;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.Enum;
import com.google.protobuf.AbstractMessageLite;
import java.lang.Number;
import java.util.HashMap;

public class LuaValue extends LuaBaseObject	// class@000d43
{
    public LuaContext _context;
    public String _tableId;
    public LuaValueType _type;
    public Object _valueContainer;

    public void LuaValue(){
       super();
       this.setNilValue();
    }
    public void LuaValue(int p0){
       super(p0);
       this.setNilValue();
    }
    public void LuaValue(int p0,LuaFunction p1){
       super(p0);
       this.setFunctionValue(p1);
    }
    public void LuaValue(int p0,LuaPointer p1){
       super(p0);
       this.setPointerValue(p1);
    }
    public void LuaValue(int p0,LuaTuple p1){
       super(p0);
       this.setTupleValue(p1);
    }
    public void LuaValue(int p0,BlockData p1){
       super(p0);
       this.setBlockDataValue(p1);
    }
    public void LuaValue(int p0,Boolean p1){
       super(p0);
       this.setBoolValue(p1);
    }
    public void LuaValue(int p0,Double p1){
       super(p0);
       this.setDoubValue(p1);
    }
    public void LuaValue(int p0,Integer p1){
       super(p0);
       this.setLongValue(Long.valueOf((long)p1.intValue()));
    }
    public void LuaValue(int p0,Object p1){
       super(p0);
       this.setObjectValue(p1);
    }
    public void LuaValue(int p0,String p1){
       super(p0);
       this.setStringValue(p1);
    }
    public void LuaValue(int p0,List p1,String p2){
       super(p0);
       this.setArrayListValue(p1);
       this._tableId = p2;
    }
    public void LuaValue(int p0,Map p1,String p2){
       super(p0);
       this.setHasMapValue(p1);
       this._tableId = p2;
    }
    public void LuaValue(int p0,byte[] p1){
       super(p0);
       this.setByteArrayValue(p1);
    }
    public void LuaValue(LuaFunction p0){
       super();
       this.setFunctionValue(p0);
    }
    public void LuaValue(LuaPointer p0){
       super();
       this.setPointerValue(p0);
    }
    public void LuaValue(LuaTuple p0){
       super();
       this.setTupleValue(p0);
    }
    public void LuaValue(GeneratedMessageLite p0){
       super();
       this.setProtoBufValue(p0);
    }
    public void LuaValue(BlockData p0){
       super();
       this.setBlockDataValue(p0);
    }
    public void LuaValue(Boolean p0){
       super();
       this.setBoolValue(p0);
    }
    public void LuaValue(Double p0){
       super();
       this.setDoubValue(p0);
    }
    public void LuaValue(Float p0){
       super();
       this.setFloatValue(p0);
    }
    public void LuaValue(Integer p0){
       super();
       this.setLongValue(Long.valueOf((long)p0.intValue()));
    }
    public void LuaValue(Long p0){
       super();
       this.setLongValue(p0);
    }
    public void LuaValue(Object p0){
       super();
       this.setObjectValue(p0);
    }
    public void LuaValue(String p0){
       super();
       this.setStringValue(p0);
    }
    public void LuaValue(List p0){
       super();
       this.setArrayListValue(p0);
    }
    public void LuaValue(Map p0){
       super();
       this.setHasMapValue(p0);
    }
    public void LuaValue(byte[] p0){
       super();
       this.setByteArrayValue(p0);
    }
    public void LuaValue(Byte[] p0){
       super();
       this.setByteArrayValue(p0);
    }
    public static LuaValue createExceptionLuaValue(int p0,String p1){
       LuaValue luaValue = new LuaValue();
       luaValue._nativeId = p0;
       luaValue._type = LuaValueType.Exception;
       luaValue._valueContainer = p1;
       return luaValue;
    }
    public BlockData asBlockData(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta != null && t_valueConta instanceof BlockData) {
          return t_valueConta;
       }
       return null;
    }
    public String asString(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta != null) {
          return t_valueConta.toString();
       }
       return null;
    }
    public String getTableId(){
       return this._tableId;
    }
    public final void setArrayListValue(List p0){
       this._type = LuaValueType.Array;
       this._valueContainer = p0;
    }
    public final void setBlockDataValue(BlockData p0){
       this._type = LuaValueType.BlockData;
       this._valueContainer = p0;
    }
    public final void setBoolValue(Boolean p0){
       this._type = LuaValueType.Boolean;
       this._valueContainer = p0;
    }
    public final void setByteArrayValue(byte[] p0){
       this._type = LuaValueType.Data;
       this._valueContainer = p0;
    }
    public final void setByteArrayValue(Byte[] p0){
       this._type = LuaValueType.Data;
       this._valueContainer = p0;
    }
    public final void setDoubValue(Double p0){
       this._type = LuaValueType.Number;
       this._valueContainer = p0;
    }
    public final void setFloatValue(Float p0){
       this._type = LuaValueType.Float;
       this._valueContainer = p0;
    }
    public final void setFunctionValue(LuaFunction p0){
       this._type = LuaValueType.Function;
       this._valueContainer = p0;
    }
    public final void setHasMapValue(Map p0){
       this._type = LuaValueType.Map;
       this._valueContainer = p0;
    }
    public final void setLongValue(Long p0){
       this._type = LuaValueType.Integer;
       this._valueContainer = p0;
    }
    public final void setNilValue(){
       this._type = LuaValueType.Nil;
       this._valueContainer = null;
    }
    public void setObject(String p0,Object p1){
       if (this.valueType() == LuaValueType.Map) {
          this._valueContainer = LuaNativeUtil.luaValueSetObject(this._context, this, p0, new LuaValue(p1));
       }
       return;
    }
    public final void setObjectValue(Object p0){
       if (p0 != null) {
          if (p0 instanceof Character) {
             this.setLongValue(Long.valueOf((long)p0.charValue()));
          }else if(p0 instanceof Byte){
             this.setLongValue(Long.valueOf((long)p0.byteValue()));
          }else if(p0 instanceof Short){
             this.setLongValue(Long.valueOf((long)p0.shortValue()));
          }else if(p0 instanceof Integer){
             this.setLongValue(Long.valueOf((long)p0.intValue()));
          }else if(p0 instanceof Long){
             this.setLongValue(p0);
          }else if(p0 instanceof Float){
             this.setFloatValue(p0);
          }else if(p0 instanceof Double){
             this.setDoubValue(p0);
          }else if(p0 instanceof Boolean){
             this.setBoolValue(p0);
          }else if(p0 instanceof String){
             this.setStringValue(p0.toString());
          }else if(p0 instanceof byte[]){
             this.setByteArrayValue(p0);
          }else if(p0 instanceof List){
             this.setArrayListValue(p0);
          }else if(p0 instanceof Map){
             this.setHasMapValue(p0);
          }else if(p0 instanceof LuaPointer){
             this.setPointerValue(p0);
          }else if(p0 instanceof LuaFunction){
             this.setFunctionValue(p0);
          }else if(p0 instanceof LuaTuple){
             this.setTupleValue(p0);
          }else {
             this._type = LuaValueType.Object;
             this._valueContainer = p0;
          }
       }else {
          this._type = LuaValueType.Nil;
          this._valueContainer = null;
       }
       return;
    }
    public final void setPointerValue(LuaPointer p0){
       this._type = LuaValueType.Pointer;
       this._valueContainer = p0;
    }
    public final void setProtoBufValue(GeneratedMessageLite p0){
       this._type = LuaValueType.Pb;
       this._valueContainer = p0;
    }
    public final void setStringValue(String p0){
       this._type = LuaValueType.String;
       this._valueContainer = p0;
    }
    public final void setTupleValue(LuaTuple p0){
       this._type = LuaValueType.Tuple;
       this._valueContainer = p0;
    }
    public ArrayList toArrayList(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return null;
       }
       if (t_valueConta instanceof ArrayList) {
          return t_valueConta;
       }
       throw new Exception("Type invalid when execute toArrayList\(\): "+this._type.name());
    }
    public BlockData toBlockData(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta instanceof BlockData) {
          return t_valueConta;
       }
       return null;
    }
    public boolean toBoolean(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return false;
       }
       if (t_valueConta instanceof Boolean) {
          return t_valueConta.booleanValue();
       }
       if (t_valueConta instanceof String) {
          return Boolean.parseBoolean(t_valueConta);
       }
       throw new Exception("Type invalid when execute toBoolean\(\): "+this._type.name());
    }
    public byte[] toByteArray(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return null;
       }
       if (t_valueConta instanceof byte[]) {
          return t_valueConta;
       }
       if (t_valueConta instanceof Byte[]) {
          byte[] uobyteArray = new byte[t_valueConta.length];
          for (int i = 0; i < t_valueConta.length; i = i + 1) {
             uobyteArray[i] = t_valueConta[i].byteValue();
          }
          return uobyteArray;
       }else if(t_valueConta instanceof String){
          return t_valueConta.getBytes();
       }else if(t_valueConta instanceof GeneratedMessageLite){
          return t_valueConta.toByteArray();
       }else {
          throw new Exception("Type invalid when execute toByteArray\(\): "+this._type.name());
       }
    }
    public double toDouble(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return 0;
       }
       if (t_valueConta instanceof Number) {
          return t_valueConta.doubleValue();
       }
       if (t_valueConta instanceof String) {
          return Double.parseDouble(t_valueConta);
       }
       throw new Exception("Type invalid when execute toDouble\(\): "+this._type.name());
    }
    public float toFloat(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return 0;
       }
       if (t_valueConta instanceof Float) {
          return t_valueConta.floatValue();
       }
       if (t_valueConta instanceof Double) {
          return t_valueConta.floatValue();
       }
       if (t_valueConta instanceof String) {
          return Float.parseFloat(t_valueConta);
       }
       throw new Exception("Type invalid when execute toFloat\(\): "+this._type.name());
    }
    public LuaFunction toFunction(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return null;
       }
       if (t_valueConta instanceof LuaFunction) {
          return t_valueConta;
       }
       throw new Exception("Type invalid when execute toLuaFunction\(\): "+this._type.name());
    }
    public GeneratedMessageLite toGeneratedMessageLite(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return null;
       }
       if (t_valueConta instanceof GeneratedMessageLite) {
          return t_valueConta;
       }
       throw new Exception("Type invalid when execute toPb\(\): "+this._type.name());
    }
    public HashMap toHashMap(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return null;
       }
       if (t_valueConta instanceof HashMap) {
          return t_valueConta;
       }
       throw new Exception("Type invalid when execute toHashMap\(\): "+this._type.name());
    }
    public long toInteger(){
       LuaValue t_valueConta = this._valueContainer;
       long l = 0;
       if (t_valueConta == null) {
          return l;
       }
       if (t_valueConta instanceof Boolean) {
          if (t_valueConta.booleanValue()) {
             l = 1;
          }
          return l;
       }else if(t_valueConta instanceof Number){
          return t_valueConta.longValue();
       }else if(t_valueConta instanceof String){
          return (long)Integer.parseInt(t_valueConta);
       }else {
          throw new Exception("Type invalid when execute toInteger\(\): "+this._type.name());
       }
    }
    public List toList(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return null;
       }
       if (t_valueConta instanceof List) {
          return t_valueConta;
       }
       throw new Exception("Type invalid when execute toList\(\): "+this._type.name());
    }
    public Map toMap(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return null;
       }
       if (t_valueConta instanceof Map) {
          return t_valueConta;
       }
       throw new Exception("Type invalid when execute toMap\(\): "+this._type.name());
    }
    public String toMetaInfo(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta instanceof BlockData) {
          return t_valueConta.getMetaInfo();
       }
       return "";
    }
    public Object toObject(){
       return this._valueContainer;
    }
    public LuaPointer toPointer(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return null;
       }
       if (t_valueConta instanceof LuaPointer) {
          return t_valueConta;
       }
       throw new Exception("Type invalid when execute toPointer\(\): "+this._type.name());
    }
    public String toString(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta != null) {
          return t_valueConta.toString();
       }
       return "";
    }
    public LuaTuple toTuple(){
       LuaValue t_valueConta = this._valueContainer;
       if (t_valueConta == null) {
          return null;
       }
       if (t_valueConta instanceof LuaTuple) {
          return t_valueConta;
       }
       throw new Exception("Type invalid when execute toTuple\(\): "+this._type.name());
    }
    public LuaValueType valueType(){
       return this._type;
    }
}
