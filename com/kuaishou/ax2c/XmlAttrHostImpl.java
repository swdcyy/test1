package com.kuaishou.ax2c.XmlAttrHostImpl;
import com.kuaishou.ax2c.IAttrHost;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;
import android.content.res.ColorStateList;
import java.lang.Number;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.lang.String;
import java.lang.CharSequence;
import android.util.TypedValue;

public class XmlAttrHostImpl implements IAttrHost	// class@001083
{
    public LinkedHashMap attrsMap;
    public List keyList;
    public static XmlAttrHostImpl emptyImpl;

    static {
       XmlAttrHostImpl.emptyImpl = new XmlAttrHostImpl();
    }
    public void XmlAttrHostImpl(){
       super();
       this.attrsMap = new LinkedHashMap();
       this.keyList = new ArrayList();
    }
    public void addAttr(int p0,Object p1){
       this.attrsMap.put(Integer.valueOf(p0), p1);
    }
    public boolean getBoolean(int p0,boolean p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Boolean) {
          return obj.booleanValue();
       }
       return false;
    }
    public int getColor(int p0,int p1){
       if (this.attrsMap.containsKey(Integer.valueOf(p0))) {
          return this.attrsMap.get(Integer.valueOf(p0)).intValue();
       }
       return p1;
    }
    public ColorStateList getColorStateList(int p0){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof ColorStateList) {
          return obj;
       }
       return null;
    }
    public float getDimension(int p0,float p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.floatValue();
       }
       return p1;
    }
    public int getDimensionPixelOffset(int p0,int p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.intValue();
       }
       return p1;
    }
    public int getDimensionPixelSize(int p0,int p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.intValue();
       }
       return p1;
    }
    public Drawable getDrawable(int p0){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Drawable) {
          return obj;
       }
       return null;
    }
    public float getFloat(int p0,float p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.floatValue();
       }
       return p1;
    }
    public Typeface getFont(int p0){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Typeface) {
          return obj;
       }
       return null;
    }
    public float getFraction(int p0,int p1,int p2,float p3){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.floatValue();
       }
       return p3;
    }
    public int getIndex(int p0){
       if (this.keyList.size() != this.attrsMap.size()) {
          this.keyList = new ArrayList(this.attrsMap.keySet());
       }
       return this.keyList.get(p0).intValue();
    }
    public int getIndexCount(){
       return this.attrsMap.size();
    }
    public int getInt(int p0,int p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.intValue();
       }
       return p1;
    }
    public int getInteger(int p0,int p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.intValue();
       }
       return p1;
    }
    public int getLayoutDimension(int p0,int p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.intValue();
       }
       return p1;
    }
    public int getLayoutDimension(int p0,String p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.intValue();
       }
       return 0;
    }
    public String getPositionDescription(){
       return null;
    }
    public int getResourceId(int p0,int p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.intValue();
       }
       return p1;
    }
    public String getString(int p0){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof String) {
          return obj;
       }
       return null;
    }
    public CharSequence getText(int p0){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof CharSequence) {
          return obj;
       }
       return null;
    }
    public CharSequence[] getTextArray(int p0){
       CharSequence[] obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof CharSequence[]) {
          return obj;
       }
       obj = new CharSequence[0];
       return obj;
    }
    public int getType(int p0){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Number) {
          return obj.intValue();
       }
       return 0;
    }
    public boolean getValue(int p0,TypedValue p1){
       Object obj = this.attrsMap.get(Integer.valueOf(p0));
       if (obj instanceof Boolean) {
          return obj.booleanValue();
       }
       return false;
    }
    public boolean hasValue(int p0){
       return this.attrsMap.containsKey(Integer.valueOf(p0));
    }
    public int length(){
       return this.attrsMap.size();
    }
}
