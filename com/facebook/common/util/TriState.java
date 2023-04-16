package com.facebook.common.util.TriState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import com.facebook.common.util.TriState$a;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class TriState extends Enum	// class@001073
{
    public static final TriState[] $VALUES;
    public static final TriState NO;
    public static final TriState UNSET;
    public static final TriState YES;

    static {
       TriState triState = new TriState("YES", 0);
       TriState.YES = triState;
       TriState triState1 = new TriState("NO", 1);
       TriState.NO = triState1;
       TriState triState2 = new TriState("UNSET", 2);
       TriState.UNSET = triState2;
       TriState[] triStateArra = new TriState[]{triState,triState1,triState2};
       TriState.$VALUES = triStateArra;
    }
    public void TriState(String p0,int p1){
       super(p0, p1);
    }
    public static TriState fromDbValue(int p0){
       if (p0 == 1) {
          return TriState.YES;
       }
       if (p0 != 2) {
          return TriState.UNSET;
       }
       return TriState.NO;
    }
    public static TriState valueOf(Boolean p0){
       TriState triState = (p0 != null)? TriState.valueOf(p0.booleanValue()): TriState.UNSET;
       return triState;
    }
    public static TriState valueOf(String p0){
       return Enum.valueOf(TriState.class, p0);
    }
    public static TriState valueOf(boolean p0){
       TriState yES = (p0)? TriState.YES: TriState.NO;
       return yES;
    }
    public static TriState[] values(){
       return TriState.$VALUES.clone();
    }
    public boolean asBoolean(){
       int i = TriState$a.a[this.ordinal()];
       boolean b = true;
       if (i == b) {
          return b;
       }
       if (i == 2) {
          return false;
       }
       if (i != 3) {
          throw new IllegalStateException("Unrecognized TriState value: "+this);
       }
       throw new IllegalStateException("No boolean equivalent for UNSET");
    }
    public boolean asBoolean(boolean p0){
       int i = TriState$a.a[this.ordinal()];
       boolean b = true;
       if (i == b) {
          return b;
       }
       if (i == 2) {
          return false;
       }
       if (i == 3) {
          return p0;
       }
       throw new IllegalStateException("Unrecognized TriState value: "+this);
    }
    public Boolean asBooleanObject(){
       int i = TriState$a.a[this.ordinal()];
       if (i == 1) {
          return Boolean.TRUE;
       }
       if (i == 2) {
          return Boolean.FALSE;
       }
       if (i == 3) {
          return null;
       }
       throw new IllegalStateException("Unrecognized TriState value: "+this);
    }
    public int getDbValue(){
       int i = TriState$a.a[this.ordinal()];
       int i1 = 1;
       if (i != i1) {
          i1 = 2;
          if (i != i1) {
             return 3;
          }
       }
       return i1;
    }
    public boolean isSet(){
       boolean b = (this != TriState.UNSET)? true: false;
       return b;
    }
}
