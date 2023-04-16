package jf1.j;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.enterroom.model.EnterRoomMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import android.text.TextUtils;
import b61.b;
import lnc.a1;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import android.text.SpannableStringBuilder;

public class j implements d	// class@002b70
{

    public void j(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       EnterRoomMessage mAuthorDispl;
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          EnterRoomMessage mDisplayUser = p0.mDisplayUserName;
          String str = null;
          if (p1.m()) {
             mAuthorDispl = p0.mAuthorDisplayMessage;
          }else if(TextUtils.equals(p0.mUser.mId, QCurrentUser.ME.getId())){
             mAuthorDispl = (TextUtils.isEmpty(p0.mEnterAudienceDisplayMessage))? p0.mAudienceDisplayMessage: p0.mEnterAudienceDisplayMessage;
          }else {
             mAuthorDispl = p0.mAudienceDisplayMessage;
          }
          boolean b = TextUtils.isEmpty(mAuthorDispl);
          String str1 = "";
          if (!TextUtils.isEmpty(mAuthorDispl) && (!TextUtils.isEmpty(mDisplayUser) && mAuthorDispl.contains(mDisplayUser))) {
             String str2 = mAuthorDispl.replace(mDisplayUser, str1);
             if (str2.startsWith(" ")) {
                str2 = str2.substring(1);
             }
             mAuthorDispl = str2;
             str = 1;
          }
       label_0071 :
          if (TextUtils.isEmpty(mAuthorDispl)) {
             str1 = f.e(b.c(p0.mUser), 6);
             int b1 = p1.m();
             mAuthorDispl = p0.mSource;
             if (mAuthorDispl != 1) {
                if (mAuthorDispl != 2) {
                   if (mAuthorDispl != 3) {
                      if (mAuthorDispl != 5) {
                         if (mAuthorDispl != 7) {
                            if (mAuthorDispl != 48) {
                               if (mAuthorDispl != 51) {
                                  if (mAuthorDispl != 76) {
                                     if (mAuthorDispl != 82) {
                                        if (mAuthorDispl != 117) {
                                           if (mAuthorDispl != 16 && mAuthorDispl != 17) {
                                              switch (mAuthorDispl){
                                                  case 10:
                                                    b1 = 0x7f102ac4;
                                                    break;
                                                  case 11:
                                                    b1 = 0x7f1020dd;
                                                    break;
                                                  case 12:
                                                    b1 = 0x7f1020e4;
                                                    break;
                                                  default:
                                                    switch (mAuthorDispl){
                                                        case 28:
                                                          b1 = 0x7f1020c2;
                                                          break;
                                                        case 29:
                                                          b1 = 0x7f1020b5;
                                                          break;
                                                        case 30:
                                                          b1 = 0x7f1020e8;
                                                          break;
                                                        default:
                                                          switch (mAuthorDispl){
                                                              case '*':
                                                                b1 = 0x7f1020e1;
                                                                break;
                                                              case '+':
                                                                b1 = 0x7f1020cc;
                                                                break;
                                                              case ',':
                                                                break;
                                                              case '-':
                                                                b1 = 0x7f1020b7;
                                                                break;
                                                              case '.':
                                                                goto label_00dc ;
                                                              default:
                                                                switch (mAuthorDispl){
                                                                    case '>':
                                                                      if (b1) {
                                                                         b1 = 0x7f1020d6;
                                                                      }else {
                                                                         b1 = 0x7f1020d7;
                                                                      }
                                                                      break;
                                                                    case '?':
                                                                      if (b1) {
                                                                         b1 = 0x7f1020da;
                                                                      }else {
                                                                         b1 = 0x7f1020db;
                                                                      }
                                                                      break;
                                                                    case '@':
                                                                    case 'A':
                                                                      b1 = 0x7f1020bd;
                                                                      break;
                                                                    case 'B':
                                                                      b1 = 0x7f1020e6;
                                                                      break;
                                                                    case 'C':
                                                                      b1 = 0x7f1020b0;
                                                                      break;
                                                                    case 'D':
                                                                      b1 = 0x7f1020c3;
                                                                      break;
                                                                    default:
                                                                      b1 = 0x7f1020b2;
                                                                }
                                                          }
                                                    }
                                              }
                                           }else {
                                              b1 = 0x7f1020ce;
                                           }
                                        }else {
                                           b1 = 0x7f1024e1;
                                        }
                                     }
                                  }else {
                                     b1 = 0x7f102424;
                                  }
                               }
                               b1 = 0x7f1020c9;
                            }else {
                               b1 = 0x7f1020bb;
                            }
                         }
                         b1 = 0x7f1020d3;
                      }else {
                         b1 = 0x7f1020df;
                      }
                   }else {
                      b1 = 0x7f1020d0;
                   }
                }else {
                   b1 = 0x7f1020bf;
                }
             }else {
                b1 = 0x7f1020b9;
             }
             mAuthorDispl = a1.p(b1);
          }
          if (TextUtils.isEmpty(str1)) {
             str1 = b.c(p0.mUser);
          }
          LiveSpannable$b uob = f.c(str1, p1);
          LiveSpannable$b uob1 = f.c(mAuthorDispl, p1);
          if (p1.p()) {
             uob.d(p1.h());
             uob1.d(R.color.arg_RES_7f060649);
          }else {
             int i = 0x7f060871;
             uob.d(i);
             uob1.d(i);
          }
          if (TextUtils.isEmpty(str1)) {
             spannableStr = liveSpannabl.j(uob1).k();
          }else if(p1.p()){
             liveSpannabl.j(uob).e().j(uob1);
          }else if(str != null || b){
             liveSpannabl.j(uob).j(uob1);
          }else {
             liveSpannabl.j(uob1);
          }
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
}
