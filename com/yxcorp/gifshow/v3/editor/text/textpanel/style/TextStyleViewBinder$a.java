package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$b;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import androidx.lifecycle.LiveData;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import huc.s;
import tb7.j;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextColorView;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$ColorsViewHolder$bind$1;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;

public final class TextStyleViewBinder$a extends RecyclerView$Adapter	// class@0014d6
{
    public final List e;
    public final TextStyleViewBinder f;

    public void TextStyleViewBinder$a(TextStyleViewBinder p0){
       this.f = p0;
       super();
       List list = new TextStyleDataManager().a();
       a.o(list, "TextStyleDataManager\(\).generateTextColorList\(\)");
       this.e = list;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, TextStyleViewBinder$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       String str;
       TextStyleViewBinder$a uoa = TextStyleViewBinder$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          a.p(p0, "holder");
          uoa = this.f;
          Pair value = uoa.m.U0(uoa.i).getValue();
          if (value != null) {
             TextStyleValue first = value.getFirst();
             if (first != null) {
                str = first.j();
             label_003c :
                TextStyleDataManager$a uoa1 = this.e.get(p1);
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoidTwoRefs(uoa1, str, p0, TextStyleViewBinder$b.class, "1")) {
                   a.p(uoa1, "colorData");
                   boolean b = (str != null && j.a(str, s.a(uoa1.a.c)))? true: false;
                   uoa1.b = b;
                   p0.a.setTextColor(uoa1);
                   p0.itemView.setOnClickListener(new TextStyleViewBinder$ColorsViewHolder$bind$1(p0, uoa1));
                }
             }
          }
          str = null;
          goto label_003c ;
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       TextStyleViewBinder$b uob;
       TextStyleViewBinder$a uoa = TextStyleViewBinder$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uob != PatchProxyResult.class) {
          label_0031 :
             return uob;
          }
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d15d8);
       a.o(view, "itemView");
       uob = new TextStyleViewBinder$b(this.f, view);
       goto label_0031 ;
    }
}
