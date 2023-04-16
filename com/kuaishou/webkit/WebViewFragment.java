package com.kuaishou.webkit.WebViewFragment;
import android.app.Fragment;
import android.webkit.WebView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

public class WebViewFragment extends Fragment	// class@00129c
{
    public boolean mIsWebViewAvailable;
    public WebView mWebView;

    public void WebViewFragment(){
       super();
    }
    public WebView getWebView(){
       WebViewFragment tmWebView = (this.mIsWebViewAvailable != null)? this.mWebView: null;
       return tmWebView;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       WebViewFragment tmWebView = this.mWebView;
       if (tmWebView != null) {
          tmWebView.destroy();
       }
       WebView webView = new WebView(this.getContext());
       this.mWebView = webView;
       this.mIsWebViewAvailable = true;
       return webView;
    }
    public void onDestroy(){
       WebViewFragment tmWebView = this.mWebView;
       if (tmWebView != null) {
          tmWebView.destroy();
          this.mWebView = null;
       }
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       this.mIsWebViewAvailable = false;
       super.onDestroyView();
    }
    public void onPause(){
       super.onPause();
       this.mWebView.onPause();
    }
    public void onResume(){
       this.mWebView.onResume();
       super.onResume();
    }
}
