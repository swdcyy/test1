package com.yxcorp.gifshow.detail.helper.a$a;
import com.yxcorp.gifshow.model.survey.ActionSurveyType;
import java.lang.Enum;

public class a$a	// class@001569
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ActionSurveyType.values().length];
       try{
          a$a.a = ointArray;
          ointArray[ActionSurveyType.REPORT.ordinal()] = 1;
          try{
             a$a.a[ActionSurveyType.FOLLOW.ordinal()] = 2;
             try{
                a$a.a[ActionSurveyType.SHARE.ordinal()] = 3;
                try{
                   a$a.a[ActionSurveyType.PLAY.ordinal()] = 4;
                   try{
                      a$a.a[ActionSurveyType.LIKE.ordinal()] = 5;
                      try{
                         a$a.a[ActionSurveyType.COMMENT.ordinal()] = 6;
                         try{
                            a$a.a[ActionSurveyType.PUSH.ordinal()] = 7;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
