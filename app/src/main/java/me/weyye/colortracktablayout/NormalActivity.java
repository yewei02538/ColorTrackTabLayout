package me.weyye.colortracktablayout;

public class NormalActivity extends BaseActivity {


    @Override
    protected void loadViewLayout() {
        setContentView(R.layout.activity_normal);
        setTitle("NormalActivity");
    }

    @Override
    protected void initTab() {
        titles = new String[]{"全部", "进行中", "这是一条长标题哦", "已完成"};
        super.initTab();
    }
}
