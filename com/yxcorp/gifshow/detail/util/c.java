package com.yxcorp.gifshow.detail.util.c;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.comment.model.CommentGuide;
import zk9.a;
import java.util.List;
import com.yxcorp.gifshow.comment.model.CommentGuide$EmojiBean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;

public final class c implements h	// class@001a2e
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       int i = 0;
       if (a.a(p0) != null && (a.a(p0).mEmojiResources != null && (a.a(p0).mEmojiResources.size() > 0 && (!TextUtils.isEmpty(a.a(p0).mEmojiResources.get(i).mkey) && !TextUtils.isEmpty(a.a(p0).mEmojiResources.get(i).mUrl))))) {
          i = true;
       }
    label_0046 :
       return Boolean.valueOf(i);
    }
}
