package txt.com.video11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayoutRoot;
    private RelativeLayout relativeLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initLayoutbyLinear();
        initLayoutbyRelative();
        //setContentView(linearLayoutRoot);
        setContentView(relativeLayoutRoot);

    }

    public void initLayoutbyRelative(){
        // relativeLayoutRoot
        relativeLayoutRoot = new RelativeLayout(this);

        // relativeLayoutSecond
        RelativeLayout relativeLayoutSecond = new RelativeLayout(this);
        RelativeLayout.LayoutParams relaLayoutParamsSecond =
                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeLayoutSecond.setLayoutParams(relaLayoutParamsSecond);
        relativeLayoutSecond.setId(R.id.rl_second);

        //ImageView
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setId(R.id.im_imageView);
        imageView.setImageResource(R.mipmap.ic_launcher);

        //textView
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParamstextView =
                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamstextView.addRule(RelativeLayout.CENTER_VERTICAL);
        layoutParamstextView.setMargins(20,0,0,0);
        layoutParamstextView.addRule(RelativeLayout.RIGHT_OF,imageView.getId());
        textView.setText(R.string.textView_Hello);
        textView.setLayoutParams(layoutParamstextView);

        //add ImageView và TextView in relativeLayoutSecond

        relativeLayoutSecond.addView(imageView);
        relativeLayoutSecond.addView(textView);

        //buttonClick

        Button buttonClick = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbuttonClick =
                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsbuttonClick.addRule(RelativeLayout.BELOW,relativeLayoutSecond.getId());
        layoutParamsbuttonClick.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonClick.setPadding(10,10,10,10);
        buttonClick.setText(R.string.textbutton_Click);
        buttonClick.setLayoutParams(layoutParamsbuttonClick);

        //buttonClick

        Button buttonHihi = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbuttonHihi =
                new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsbuttonHihi.addRule(RelativeLayout.BELOW,buttonClick.getId());
        layoutParamsbuttonHihi.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonHihi.setPadding(10,10,10,10);
        buttonHihi.setText(R.string.textbutton_Hihi);
        buttonHihi.setLayoutParams(layoutParamsbuttonHihi);

        //add RelativeLayoutSecond, buttonClick và buttonHihi vào RelativeLayoutRoot
        relativeLayoutRoot.addView(relativeLayoutSecond);
        relativeLayoutRoot.addView(buttonClick);
        relativeLayoutRoot.addView(buttonHihi);


    }

    public void initLayoutbyLinear (){
        //linearLayoutRoot
        linearLayoutRoot = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsRoot = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);
        linearLayoutRoot.setLayoutParams(layoutParamsRoot);

        //linearLayout Second
        LinearLayout linearLayoutSecond = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsSecond = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayoutSecond.setOrientation(LinearLayout.HORIZONTAL);
        linearLayoutSecond.setLayoutParams(layoutParamsSecond);

        //ImageView
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setImageResource(R.mipmap.ic_launcher);

        // TextView
        TextView textView = new TextView(this);
        LinearLayout.LayoutParams layoutParamstextView = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamstextView.gravity = Gravity.CENTER;
        layoutParamstextView.setMargins(20,0,0,0);
        textView.setLayoutParams(layoutParamstextView);
        textView.setText(R.string.textView_Hello);

        //add ImageView và TextView in linearLayoutSecond
        linearLayoutSecond.addView(imageView);
        linearLayoutSecond.addView(textView);

        // Button Click

        Button buttonClick = new Button(this);
        LinearLayout.LayoutParams layoutParamsbuttonClick =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        buttonClick.setLayoutParams(layoutParamsbuttonClick);
        layoutParamsbuttonClick.gravity = Gravity.CENTER;
        buttonClick.setPadding(20,0,0,0);
        buttonClick.setText(R.string.textbutton_Click);

        // Button Hihi

        Button buttonHihi = new Button(this);
        LinearLayout.LayoutParams layoutParamsbuttonHihi =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        buttonHihi.setLayoutParams(layoutParamsbuttonHihi);
        layoutParamsbuttonHihi.gravity = Gravity.CENTER;
        buttonHihi.setPadding(20,0,0,0);
        buttonHihi.setText(R.string.textbutton_Hihi);

        // add linearLayoutSecond, buttonClick và button Hihi in LinearlayoutRoot
        linearLayoutRoot.addView(linearLayoutSecond);
        linearLayoutRoot.addView(buttonClick);
        linearLayoutRoot.addView(buttonHihi);

    }
}