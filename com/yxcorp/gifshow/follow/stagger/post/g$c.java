package com.yxcorp.gifshow.follow.stagger.post.g$c;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Enum;

public class g$c	// class@0011e6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KwaiOp.values().length];
       try{
          g$c.a = ointArray;
          ointArray[KwaiOp.FORWARD_WECHAT_FRIEND.ordinal()] = 1;
          try{
             g$c.a[KwaiOp.FORWARD_WECHAT_MOMENT.ordinal()] = 2;
             try{
                g$c.a[KwaiOp.FORWARD_QQ.ordinal()] = 3;
                try{
                   g$c.a[KwaiOp.FORWARD_QZONE.ordinal()] = 4;
                   try{
                      g$c.a[KwaiOp.FORWARD_WEIBO.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
