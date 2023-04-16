package com.gifshow.twitter.widget.Extractor;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import pj.a;
import java.util.Collections;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.gifshow.twitter.widget.Extractor$Entity;
import java.lang.Integer;
import com.gifshow.twitter.widget.Extractor$Entity$Type;
import java.util.Collection;
import com.gifshow.twitter.widget.a;
import java.util.Comparator;
import java.util.Iterator;

public class Extractor	// class@0015f9
{
    public boolean a;

    public void Extractor(){
       super();
       this.a = true;
    }
    public List a(String p0){
       List list;
       Extractor$Entity uEntity;
       List list1;
       Iterator iterator;
       a uoa = a.class;
       if (p0 == null || !p0.length()) {
          list = Collections.emptyList();
       }else {
          char[] uocharArray = p0.toCharArray();
          int len = uocharArray.length;
          int i = 0;
          int i1 = 0;
          int i2 = 1;
          while (i1 < len) {
             char c = uocharArray[i1];
             if (c == '#' || c == 0xff03) {
                i = 1;
                break ;
             }
             i1 = i1 + 1;
          }
          if (!i) {
             list = Collections.emptyList();
          }else {
             ArrayList uArrayList = new ArrayList();
             _monitor_enter(uoa);
             i = 2;
             if (a.e == null) {
                a.e = Pattern.compile("\(#|££\)\([\\p{L}\\p{M}\\p{Nd}_\\u200c\\u200d\\ua67e\\u05be\\u05f3\\u05f4\\u309b\\u309c\\u30a0\\u30fb\\u3003\\u0f0b\\u0f0c\\u00b7]*[\\p{L}\\p{M}][\\p{L}\\p{M}\\p{Nd}_\\u200c\\u200d\\ua67e\\u05be\\u05f3\\u05f4\\u309b\\u309c\\u30a0\\u30fb\\u3003\\u0f0b\\u0f0c\\u00b7]*|[\\p{L}\\p{M}\\p{Nd}_\\u200c\\u200d\\ua67e\\u05be\\u05f3\\u05f4\\u309b\\u309c\\u30a0\\u30fb\\u3003\\u0f0b\\u0f0c\\u00b7]*[\\p{L}\\p{M}][\\p{L}\\p{M}\\p{Nd}_\\u200c\\u200d\\ua67e\\u05be\\u05f3\\u05f4\\u309b\\u309c\\u30a0\\u30fb\\u3003\\u0f0b\\u0f0c\\u00b7]*#\)", i);
             }
             _monitor_exit(uoa);
             Matcher matcher = a.e.matcher(p0);
             int i3 = -1;
             while (matcher.find()) {
                String str = p0.substring(matcher.end());
                _monitor_enter(uoa);
                if (a.f == null) {
                   a.f = Pattern.compile("^\(?://\)");
                }
                _monitor_exit(uoa);
                if (!a.f.matcher(str).find()) {
                   if (uArrayList.size() > 0) {
                      i1 = uArrayList.size() - i2;
                      uEntity = uArrayList.get(i1);
                   }else {
                      uEntity = null;
                   }
                   if (uEntity == null || matcher.start() > uEntity.a().intValue()) {
                      int i4 = matcher.start(i) + i3;
                      uArrayList.add(new Extractor$Entity(i4, matcher.end(i), matcher.group(i), Extractor$Entity$Type.HASHTAG));
                   }
                }
             }
             if (p0.length()) {
                len = (this.a != null)? 46: 58;
                if (p0.indexOf(len) != i3) {
                   list1 = new ArrayList();
                   _monitor_enter(uoa);
                   if (a.l == null) {
                      a.l = Pattern.compile(a.d, i);
                   }
                   _monitor_exit(uoa);
                   Matcher matcher1 = a.l.matcher(p0);
                   while (matcher1.find()) {
                      if (matcher1.group(4) == null) {
                         if (this.a != null) {
                            _monitor_enter(uoa);
                            if (a.n == null) {
                               a.n = Pattern.compile("[-_./]$");
                            }
                            _monitor_exit(uoa);
                            if (a.n.matcher(matcher1.group(i)).matches()) {
                               continue ;
                            }
                         }
                      }
                      String str1 = matcher1.group(3);
                      i3 = matcher1.start(3);
                      i1 = matcher1.end(3);
                      _monitor_enter(uoa);
                      if (a.m == null) {
                         a.m = Pattern.compile("^https?:\\/\\/t\\.co\\/[a-z0-9]+", i);
                      }
                      _monitor_exit(uoa);
                      Matcher matcher2 = a.m.matcher(str1);
                      if (matcher2.find()) {
                         str1 = matcher2.group();
                         i1 = str1.length() + i3;
                      }
                      list1.add(new Extractor$Entity(i3, i1, str1, Extractor$Entity$Type.URL));
                   }
                   if (!list1.isEmpty()) {
                      uArrayList.addAll(list1);
                      Collections.sort(uArrayList, new a(this));
                      if (!uArrayList.isEmpty()) {
                         iterator = uArrayList.iterator();
                         Extractor$Entity uEntity1 = iterator.next();
                         while (iterator.hasNext()) {
                            Extractor$Entity uEntity2 = iterator.next();
                            if (uEntity1.a().intValue() > uEntity2.b().intValue()) {
                               iterator.remove();
                            }else {
                               uEntity1 = uEntity2;
                            }
                         }
                      }
                      iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         if (iterator.next().c() != Extractor$Entity$Type.HASHTAG) {
                            iterator.remove();
                         }
                      }
                   }
                   list = uArrayList;
                }
             }
             list1 = Collections.emptyList();
             goto label_015b ;
          }
       }
       return list;
    }
}
