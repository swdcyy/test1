package com.yxcorp.gifshow.detail.fragments.milano.profile.j;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.text.TextPaint;
import lnc.a1;
import o07.n;

public final class j implements PopupInterface$f	// class@001552
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       TextView textView = new TextView(p0.u());
       textView.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       textView.setBackgroundResource(R.drawable.arg_RES_7f081900);
       textView.getPaint().setFakeBoldText(true);
       textView.setTextSize(14.00f);
       textView.setTextColor(a1.a(R.color.arg_RES_7f060967));
       textView.setText(R.string.arg_RES_7f104c8a);
       return textView;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
