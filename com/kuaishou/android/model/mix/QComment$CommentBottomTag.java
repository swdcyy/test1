package com.kuaishou.android.model.mix.QComment$CommentBottomTag;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.TextUtils;

public class QComment$CommentBottomTag implements Serializable, a	// class@000dc5
{
    public int mBgColor;
    public int mBgColorNight;
    public String mBgColorNightStr;
    public String mBgColorStr;
    public String mExtra;
    public String mText;
    public int mTextColor;
    public int mTextColorNight;
    public String mTextColorNightStr;
    public String mTextColorStr;
    public String mTextKey;
    public static final long serialVersionUID = 0x45b430e6d6e8f8ea;

    public void QComment$CommentBottomTag(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, QComment$CommentBottomTag.class, "1")) {
          return;
       }
       this.mTextColor = TextUtils.J(this.mTextColorStr, 0);
       this.mTextColorNight = TextUtils.J(this.mTextColorNightStr, 0);
       this.mBgColor = TextUtils.J(this.mBgColorStr, 0);
       this.mBgColorNight = TextUtils.J(this.mBgColorNightStr, 0);
       return;
    }
}
