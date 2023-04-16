package com.yxcorp.plugin.setting.entries.holder.h$b;
import x07.b;
import com.yxcorp.plugin.setting.entries.holder.h;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.widget.ImageView;
import android.text.TextPaint;
import com.yxcorp.plugin.setting.entries.holder.h$b$a;
import android.view.View$OnClickListener;

public class h$b extends b	// class@00085d
{
    public final h c;

    public void h$b(h p0,int p1){
       this.c = p0;
       super(p1);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, h$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.a(p0, p1, p2, p3);
       TextView textView = view.findViewById(R.id.first_title_bold);
       textView.setText(R.string.arg_RES_7f1049a7);
       textView.getPaint().setFakeBoldText(true);
       view.findViewById(R.id.back_arrow).setBackgroundResource(R.drawable.arg_RES_7f080623);
       view.findViewById(R.id.find_phone_info).setVisibility(8);
       textView = view.findViewById(R.id.simple_info_text);
       textView.setVisibility(0);
       textView.setText(R.string.arg_RES_7f10494c);
       view.findViewById(R.id.back_arrow).setOnClickListener(new h$b$a(this, p0));
       return view;
    }
}
