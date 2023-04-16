package com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs$a;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;

public final class TextStyleAttrs implements Parcelable	// class@00146c
{
    public boolean b;
    public boolean c;
    public boolean d;
    public List e;
    public static final Parcelable$Creator CREATOR;

    static {
       TextStyleAttrs.CREATOR = new TextStyleAttrs$a();
    }
    public void TextStyleAttrs(){
       super(false, false, false, null, 15, null);
    }
    public void TextStyleAttrs(boolean p0,boolean p1,boolean p2,List p3){
       a.p(p3, "availableTextModeList");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void TextStyleAttrs(boolean p0,boolean p1,boolean p2,List p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = false;
       }
       if (p4 & 0x02) {
          p1 = false;
       }
       if (p4 & 0x04) {
          p2 = false;
       }
       ArrayList uArrayList = (p4 & 0x08)? new ArrayList(): null;
       super(p0, p1, p2, uArrayList);
       return;
    }
    public final List a(){
       return this.e;
    }
    public final boolean b(){
       return this.d;
    }
    public final boolean c(){
       return this.c;
    }
    public final boolean d(){
       return this.b;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextStyleAttrs.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TextStyleAttrs && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && a.g(this.e, p0.e)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       TextStyleAttrs te;
       TextStyleAttrs obj = PatchProxy.apply(null, this, TextStyleAttrs.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       TextStyleAttrs tc = this.c;
       if (tc != null) {
          tc = 1;
       }
       i1 = (i1 + tc) * 31;
       tc = this.d;
       if (tc == null) {
          te = tc;
       }
       i1 = (i1 + i) * 31;
       te = this.e;
       i = (te != null)? te.hashCode(): 0;
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TextStyleAttrs.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TextStyleAttrs\(textModeAvailable="+this.b+", textColorAvailable="+this.c+", textAlignAvailable="+this.d+", availableTextModeList="+this.e+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(TextStyleAttrs.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TextStyleAttrs.class, "6")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.d);
       TextStyleAttrs te = this.e;
       p0.writeInt(te.size());
       Iterator iterator = te.iterator();
       while (iterator.hasNext()) {
          p0.writeInt(iterator.next().intValue());
       }
       return;
    }
}
