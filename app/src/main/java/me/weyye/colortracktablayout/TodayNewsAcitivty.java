package me.weyye.colortracktablayout;

public class TodayNewsAcitivty extends BaseActivity {

    @Override
    protected void loadViewLayout() {
        setContentView(R.layout.activity_today_news_acitivty);
        setTitle("TodayNewsAcitivty");
    }

    @Override
    protected void initTab() {

        titles = new String[]{"推荐", "视频", "热点是个长标题", "社会", "娱乐", "科技", "汽车", "体育", "财经", "军事", "国际", "时尚", "游戏", "旅游", "历史", "探索", "美食", "育儿", "养生", "故事", "美文"};
        mTab.setTabPaddingLeftAndRight(20, 20);
        mTab.setSelectedTabIndicatorHeight(0);
        super.initTab();
        mViewPager.setOffscreenPageLimit(titles.length);
    }
}
