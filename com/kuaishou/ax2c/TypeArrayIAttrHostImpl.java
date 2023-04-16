package com.kuaishou.ax2c.TypeArrayIAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import android.content.res.TypedArray;
import java.lang.Object;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import java.lang.String;
import java.lang.CharSequence;
import android.util.TypedValue;

public class TypeArrayIAttrHostImpl implements IAttrHost	// class@000fc3
{
    public TypedArray realTypeArray;

    public void TypeArrayIAttrHostImpl(TypedArray p0){
       super();
       this.realTypeArray = p0;
    }
    public boolean getBoolean(int p0,boolean p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return false;
       }
       return trealTypeArr.getBoolean(p0, p1);
    }
    public int getColor(int p0,int p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getColor(p0, p1);
    }
    public ColorStateList getColorStateList(int p0){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return null;
       }
       return trealTypeArr.getColorStateList(p0);
    }
    public float getDimension(int p0,float p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getDimension(p0, p1);
    }
    public int getDimensionPixelOffset(int p0,int p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getDimensionPixelOffset(p0, p1);
    }
    public int getDimensionPixelSize(int p0,int p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getDimensionPixelSize(p0, p1);
    }
    public Drawable getDrawable(int p0){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return null;
       }
       return trealTypeArr.getDrawable(p0);
    }
    public float getFloat(int p0,float p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getFloat(p0, p1);
    }
    public Typeface getFont(int p0){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return null;
       }
       return trealTypeArr.getFont(p0);
    }
    public float getFraction(int p0,int p1,int p2,float p3){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getFraction(p0, p1, p2, p3);
    }
    public int getIndex(int p0){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getIndex(p0);
    }
    public int getIndexCount(){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getIndexCount();
    }
    public int getInt(int p0,int p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getInt(p0, p1);
    }
    public int getInteger(int p0,int p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getInteger(p0, p1);
    }
    public int getLayoutDimension(int p0,int p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getLayoutDimension(p0, p1);
    }
    public int getLayoutDimension(int p0,String p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getLayoutDimension(p0, p1);
    }
    public String getPositionDescription(){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return "";
       }
       return trealTypeArr.getPositionDescription();
    }
    public int getResourceId(int p0,int p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getResourceId(p0, p1);
    }
    public String getString(int p0){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return null;
       }
       return trealTypeArr.getString(p0);
    }
    public CharSequence getText(int p0){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return null;
       }
       return trealTypeArr.getText(p0);
    }
    public CharSequence[] getTextArray(int p0){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return null;
       }
       return trealTypeArr.getTextArray(p0);
    }
    public int getType(int p0){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.getType(p0);
    }
    public boolean getValue(int p0,TypedValue p1){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return false;
       }
       return trealTypeArr.getValue(p0, p1);
    }
    public boolean hasValue(int p0){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return false;
       }
       return trealTypeArr.hasValue(p0);
    }
    public int length(){
       TypeArrayIAttrHostImpl trealTypeArr = this.realTypeArray;
       if (trealTypeArr == null) {
          return 0;
       }
       return trealTypeArr.length();
    }
}
