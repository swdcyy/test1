package com.yxcorp.gifshow.follow.model.FilterBox;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.follow.model.FilterOption;
import com.kwai.robust.PatchProxyResult;
import ra6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class FilterBox implements Serializable	// class@0010f9
{
    public String mDisplayText;
    public String mDisplayTextEng;
    public String mDisplayTextTc;
    public String mName;
    public List mOptions;
    public static final long serialVersionUID = 0xedc99d85766216a8;

    public void FilterBox(){
       super();
    }
    public void clearSelect(){
       if (PatchProxy.applyVoid(null, this, FilterBox.class, "1")) {
          return;
       }
       if (q.f(this.mOptions)) {
          return;
       }
       Iterator iterator = this.mOptions.iterator();
       while (iterator.hasNext()) {
          iterator.next().mSelected = false;
       }
       return;
    }
    public String getShowDisplayText(){
       Object obj = PatchProxy.apply(null, this, FilterBox.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.e() && !TextUtils.x(this.mDisplayTextEng)) {
          return this.mDisplayTextEng;
       }
       if (!a.f() && !TextUtils.x(this.mDisplayTextTc)) {
          return this.mDisplayTextTc;
       }
       return this.mDisplayText;
    }
    public boolean isDisplayTextNotEmpty(){
       Object obj = PatchProxy.apply(null, this, FilterBox.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.e() && !TextUtils.x(this.mDisplayTextEng)) {
          return (TextUtils.x(this.mDisplayTextEng) ^ 0x01);
       }
       if (!a.f() && !TextUtils.x(this.mDisplayTextTc)) {
          return (TextUtils.x(this.mDisplayTextTc) ^ 0x01);
       }
       return (TextUtils.x(this.mDisplayText) ^ 0x01);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FilterBox.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FilterBox{mName=\'"+this.mName+'''+", mDisplayText=\'"+this.mDisplayText+'''+", mOptions="+this.mOptions+'}';
    }
}
