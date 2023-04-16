package com.facebook.react.modules.datepicker.DatePickerDialogFragment$a;
import com.facebook.react.modules.datepicker.DatePickerMode;
import java.lang.Enum;

public class DatePickerDialogFragment$a	// class@0012a1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DatePickerMode.values().length];
       try{
          DatePickerDialogFragment$a.a = ointArray;
          ointArray[DatePickerMode.CALENDAR.ordinal()] = 1;
          try{
             DatePickerDialogFragment$a.a[DatePickerMode.SPINNER.ordinal()] = 2;
             try{
                DatePickerDialogFragment$a.a[DatePickerMode.DEFAULT.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
