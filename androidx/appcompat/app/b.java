package androidx.appcompat.app.b;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import androidx.collection.SimpleArrayMap;
import java.lang.Object;
import ll8.c$b;
import android.content.res.TypedArray;
import u0.d;
import android.view.View;
import android.content.ContextWrapper;
import a2.i0;
import androidx.appcompat.app.b$a;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import w0.v;
import java.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.StringBuilder;
import java.lang.ClassLoader;
import java.lang.IllegalStateException;

public class b	// class@000587
{
    public final Object[] mConstructorArgs;
    public static final String[] sClassPrefixList;
    public static final SimpleArrayMap sConstructorMap;
    public static final Class[] sConstructorSignature;
    public static final int[] sOnClickAttrs;

    static {
       Class[] uClassArray = new Class[]{Context.class,AttributeSet.class};
       b.sConstructorSignature = uClassArray;
       int[] ointArray = new int[]{0x101026f};
       b.sOnClickAttrs = ointArray;
       String[] stringArray = new String[]{"android.widget.","android.view.","android.webkit."};
       b.sClassPrefixList = stringArray;
       b.sConstructorMap = new SimpleArrayMap();
    }
    public void b(){
       super();
       Object[] objArray = new Object[2];
       this.mConstructorArgs = objArray;
    }
    public static Context themifyContext(Context p0,AttributeSet p1,boolean p2,boolean p3){
       d uod;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.X5, 0, 0);
       int resourceId = (p2)? typedArray.getResourceId(0, 0): 0;
       if (p3 && !resourceId) {
          resourceId = typedArray.getResourceId(4, 0);
       }
       typedArray.recycle();
       if (resourceId && (!p0 instanceof d || p0.c() != resourceId)) {
          uod = new d(p0, resourceId);
       }
       return uod;
    }
    public final void checkOnClickListener(View p0,AttributeSet p1){
       Context context = p0.getContext();
       if (context instanceof ContextWrapper && i0.T(p0)) {
          TypedArray typedArray = context.obtainStyledAttributes(p1, b.sOnClickAttrs);
          String str = typedArray.getString(0);
          if (str != null) {
             p0.setOnClickListener(new b$a(p0, str));
          }
          typedArray.recycle();
       }
       return;
    }
    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context p0,AttributeSet p1){
       return new AppCompatAutoCompleteTextView(p0, p1);
    }
    public AppCompatButton createButton(Context p0,AttributeSet p1){
       return new AppCompatButton(p0, p1);
    }
    public AppCompatCheckBox createCheckBox(Context p0,AttributeSet p1){
       return new AppCompatCheckBox(p0, p1);
    }
    public AppCompatCheckedTextView createCheckedTextView(Context p0,AttributeSet p1){
       return new AppCompatCheckedTextView(p0, p1);
    }
    public AppCompatEditText createEditText(Context p0,AttributeSet p1){
       return new AppCompatEditText(p0, p1);
    }
    public AppCompatImageButton createImageButton(Context p0,AttributeSet p1){
       return new AppCompatImageButton(p0, p1);
    }
    public AppCompatImageView createImageView(Context p0,AttributeSet p1){
       return new AppCompatImageView(p0, p1);
    }
    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context p0,AttributeSet p1){
       return new AppCompatMultiAutoCompleteTextView(p0, p1);
    }
    public AppCompatRadioButton createRadioButton(Context p0,AttributeSet p1){
       return new AppCompatRadioButton(p0, p1);
    }
    public AppCompatRatingBar createRatingBar(Context p0,AttributeSet p1){
       return new AppCompatRatingBar(p0, p1);
    }
    public AppCompatSeekBar createSeekBar(Context p0,AttributeSet p1){
       return new AppCompatSeekBar(p0, p1);
    }
    public AppCompatSpinner createSpinner(Context p0,AttributeSet p1){
       return new AppCompatSpinner(p0, p1);
    }
    public AppCompatTextView createTextView(Context p0,AttributeSet p1){
       return new AppCompatTextView(p0, p1);
    }
    public AppCompatToggleButton createToggleButton(Context p0,AttributeSet p1){
       return new AppCompatToggleButton(p0, p1);
    }
    public View createView(Context p0,String p1,AttributeSet p2){
       return null;
    }
    public final View createView(View p0,String p1,Context p2,AttributeSet p3,boolean p4,boolean p5,boolean p6,boolean p7){
       AppCompatRatingBar uAppCompatRa;
       Context context = (p4 && p0 != null)? p0.getContext(): p2;
       if (p5 || p6) {
          context = b.themifyContext(context, p3, p5, p6);
       }
       if (p7) {
          v.a(context);
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0x8bfb3116:
             if (p1.equals("RatingBar")) {
                i = 0;
             }
             break;
           case 0xa93fea19:
             if (p1.equals("CheckedTextView")) {
                i = 1;
             }
             break;
           case 0xafc55853:
             if (p1.equals("MultiAutoCompleteTextView")) {
                i = 2;
             }
             break;
           case 0xc808f992:
             if (p1.equals("TextView")) {
                i = 3;
             }
             break;
           case 0xc81fb44d:
             if (p1.equals("ImageButton")) {
                i = 4;
             }
             break;
           case 0xd8bf9a5b:
             if (p1.equals("SeekBar")) {
                i = 5;
             }
             break;
           case 0xebbf49f9:
             if (p1.equals("Spinner")) {
                i = 6;
             }
             break;
           case 0x2e46a6ed:
             if (p1.equals("RadioButton")) {
                i = 7;
             }
             break;
           case 0x2fa453c6:
             if (p1.equals("ToggleButton")) {
                i = 8;
             }
             break;
           case 0x431b5280:
             if (p1.equals("ImageView")) {
                i = 9;
             }
             break;
           case 0x5445f9ba:
             if (p1.equals("AutoCompleteTextView")) {
                i = 10;
             }
             break;
           case 0x5f7507c3:
             if (p1.equals("CheckBox")) {
                i = 11;
             }
             break;
           case 0x63577677:
             if (p1.equals("EditText")) {
                i = 12;
             }
             break;
           case 0x77471352:
             if (p1.equals("Button")) {
                i = 13;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             uAppCompatRa = this.createRatingBar(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 1:
             uAppCompatRa = this.createCheckedTextView(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 2:
             uAppCompatRa = this.createMultiAutoCompleteTextView(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 3:
             uAppCompatRa = this.createTextView(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 4:
             uAppCompatRa = this.createImageButton(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 5:
             uAppCompatRa = this.createSeekBar(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 6:
             uAppCompatRa = this.createSpinner(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 7:
             uAppCompatRa = this.createRadioButton(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 8:
             uAppCompatRa = this.createToggleButton(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 9:
             uAppCompatRa = this.createImageView(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 10:
             uAppCompatRa = this.createAutoCompleteTextView(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 11:
             uAppCompatRa = this.createCheckBox(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 12:
             uAppCompatRa = this.createEditText(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           case 13:
             uAppCompatRa = this.createButton(context, p3);
             this.verifyNotNull(uAppCompatRa, p1);
             break;
           default:
             uAppCompatRa = this.createView(context, p1, p3);
       }
       if (uAppCompatRa == null && p2 != context) {
          uAppCompatRa = this.createViewFromTag(context, p1, p3);
       }
       if (uAppCompatRa != null) {
          this.checkOnClickListener(uAppCompatRa, p3);
       }
       return uAppCompatRa;
    }
    public final View createViewByPrefix(Context p0,String p1,String p2){
       try{
          SimpleArrayMap sConstructor = b.sConstructorMap;
          Constructor uConstructor = sConstructor.get(p1);
          if (uConstructor == null) {
             p2 = (p2 != null)? p2+p1: p1;
             uConstructor = Class.forName(p2, false, p0.getClassLoader()).asSubclass(View.class).getConstructor(b.sConstructorSignature);
             sConstructor.put(p1, uConstructor);
          }
          uConstructor.setAccessible(true);
          return uConstructor.newInstance(this.mConstructorArgs);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public final View createViewFromTag(Context p0,String p1,AttributeSet p2){
       b tmConstructo1;
       View view;
       if (p1.equals("view")) {
          p1 = p2.getAttributeValue(null, "class");
       }
       int i = 0;
       try{
          b tmConstructo = this.mConstructorArgs;
          tmConstructo[i] = p0;
          tmConstructo[1] = p2;
          if (-1 == p1.indexOf(46)) {
             int i1 = 0;
             while (true) {
                String[] sClassPrefix = b.sClassPrefixList;
                if (i1 < sClassPrefix.length) {
                   view = this.createViewByPrefix(p0, p1, sClassPrefix[i1]);
                   if (view != null) {
                      break ;
                   }else {
                      i1++;
                   }
                }else {
                   tmConstructo1 = this.mConstructorArgs;
                   tmConstructo1[i] = null;
                   tmConstructo1[1] = null;
                   return null;
                }
             }
             tmConstructo1 = this.mConstructorArgs;
             tmConstructo1[i] = null;
             tmConstructo1[1] = null;
             return view;
          }else {
             b tmConstructo2 = this.mConstructorArgs;
             tmConstructo2[i] = null;
             tmConstructo2[1] = null;
             return this.createViewByPrefix(p0, p1, null);
          }
       }catch(java.lang.Exception e0){
          tmConstructo1 = this.mConstructorArgs;
          tmConstructo1[i] = null;
          tmConstructo1[e0] = null;
          return null;
       }
    }
    public final void verifyNotNull(View p0,String p1){
       if (p0 != null) {
          return;
       }
       throw new IllegalStateException(this.getClass().getName()+" asked to inflate view for <"+p1+">, but returned null");
    }
}
