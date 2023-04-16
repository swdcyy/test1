package cn.vimfung.luascriptcore.LuaValueType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LuaValueType extends Enum	// class@000d44
{
    public int _value;
    public static final LuaValueType[] $VALUES;
    public static final LuaValueType Array;
    public static final LuaValueType BlockData;
    public static final LuaValueType Boolean;
    public static final LuaValueType Data;
    public static final LuaValueType Exception;
    public static final LuaValueType Float;
    public static final LuaValueType Function;
    public static final LuaValueType Integer;
    public static final LuaValueType Map;
    public static final LuaValueType Nil;
    public static final LuaValueType Number;
    public static final LuaValueType Object;
    public static final LuaValueType Pb;
    public static final LuaValueType Pointer;
    public static final LuaValueType String;
    public static final LuaValueType Tuple;

    static {
       LuaValueType luaValueType = new LuaValueType("Nil", 0, 0);
       LuaValueType.Nil = luaValueType;
       LuaValueType luaValueType1 = new LuaValueType("Number", 1, 1);
       LuaValueType.Number = luaValueType1;
       LuaValueType luaValueType2 = new LuaValueType("Boolean", 2, 2);
       LuaValueType.Boolean = luaValueType2;
       LuaValueType luaValueType3 = new LuaValueType("String", 3, 3);
       LuaValueType.String = luaValueType3;
       LuaValueType luaValueType4 = new LuaValueType("Array", 4, 4);
       LuaValueType.Array = luaValueType4;
       LuaValueType luaValueType5 = new LuaValueType("Map", 5, 5);
       LuaValueType.Map = luaValueType5;
       LuaValueType luaValueType6 = new LuaValueType("Pointer", 6, 6);
       LuaValueType.Pointer = luaValueType6;
       LuaValueType luaValueType7 = new LuaValueType("Object", 7, 7);
       LuaValueType.Object = luaValueType7;
       LuaValueType luaValueType8 = new LuaValueType("Integer", 8, 8);
       LuaValueType.Integer = luaValueType8;
       LuaValueType luaValueType9 = new LuaValueType("Data", 9, 9);
       LuaValueType.Data = luaValueType9;
       LuaValueType luaValueType10 = new LuaValueType("Function", 10, 10);
       LuaValueType.Function = luaValueType10;
       LuaValueType luaValueType11 = new LuaValueType("Tuple", 11, 11);
       LuaValueType.Tuple = luaValueType11;
       LuaValueType luaValueType12 = new LuaValueType("Float", 12, 19);
       LuaValueType.Float = luaValueType12;
       LuaValueType luaValueType13 = luaValueType12;
       LuaValueType luaValueType14 = new LuaValueType("Pb", 13, 20);
       LuaValueType.Pb = luaValueType14;
       LuaValueType luaValueType15 = luaValueType14;
       LuaValueType luaValueType16 = new LuaValueType("Exception", 14, 30);
       LuaValueType.Exception = luaValueType16;
       LuaValueType luaValueType17 = luaValueType16;
       luaValueType14 = new LuaValueType("BlockData", 15, 40);
       LuaValueType.BlockData = luaValueType14;
       LuaValueType[] luaValueType18 = new LuaValueType[16];
       luaValueType18[0] = luaValueType;
       luaValueType18[1] = luaValueType1;
       luaValueType18[2] = luaValueType2;
       luaValueType18[3] = luaValueType3;
       luaValueType18[4] = luaValueType4;
       luaValueType18[5] = luaValueType5;
       luaValueType18[6] = luaValueType6;
       luaValueType18[7] = luaValueType7;
       luaValueType18[8] = luaValueType8;
       luaValueType18[9] = luaValueType9;
       luaValueType18[10] = luaValueType10;
       luaValueType18[11] = luaValueType11;
       luaValueType18[12] = luaValueType13;
       luaValueType18[13] = luaValueType15;
       luaValueType18[14] = luaValueType17;
       luaValueType18[15] = luaValueType14;
       LuaValueType.$VALUES = luaValueType18;
    }
    public void LuaValueType(String p0,int p1,int p2){
       super(p0, p1);
       this._value = p2;
    }
    public static LuaValueType valueOf(String p0){
       return Enum.valueOf(LuaValueType.class, p0);
    }
    public static LuaValueType[] values(){
       return LuaValueType.$VALUES.clone();
    }
    public int value(){
       return this._value;
    }
}
