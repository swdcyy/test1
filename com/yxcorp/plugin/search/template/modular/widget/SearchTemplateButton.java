package com.yxcorp.plugin.search.template.modular.widget.SearchTemplateButton;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import med.a;

public class SearchTemplateButton extends LinearLayout	// class@00077f
{
    public a b;

    public void SearchTemplateButton(Context p0){
       super(p0);
       this.a();
    }
    public void SearchTemplateButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void SearchTemplateButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SearchTemplateButton.class, "1")) {
          return;
       }
       LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d143b, this);
       a uoa = new a();
       this.b = uoa;
       uoa.c(this);
       return;
    }
}
