package com.kuaishou.ax2c.IAttrHost;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import java.lang.String;
import java.lang.CharSequence;
import android.util.TypedValue;

public interface abstract IAttrHost	// class@000fb4
{

    boolean getBoolean(int p0,boolean p1);
    int getColor(int p0,int p1);
    ColorStateList getColorStateList(int p0);
    float getDimension(int p0,float p1);
    int getDimensionPixelOffset(int p0,int p1);
    int getDimensionPixelSize(int p0,int p1);
    Drawable getDrawable(int p0);
    float getFloat(int p0,float p1);
    Typeface getFont(int p0);
    float getFraction(int p0,int p1,int p2,float p3);
    int getIndex(int p0);
    int getIndexCount();
    int getInt(int p0,int p1);
    int getInteger(int p0,int p1);
    int getLayoutDimension(int p0,int p1);
    int getLayoutDimension(int p0,String p1);
    String getPositionDescription();
    int getResourceId(int p0,int p1);
    String getString(int p0);
    CharSequence getText(int p0);
    CharSequence[] getTextArray(int p0);
    int getType(int p0);
    boolean getValue(int p0,TypedValue p1);
    boolean hasValue(int p0);
    int length();
}
