package cn.bgs.retrofit.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/12/25.
 */

public class GetBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"8d9c808945b86c81f08eb71fcc9517b1","title":"农村男子奇装异服，展示一场山村维秘秀，众人表示不忍直视","date":"2017-12-25 18:00","category":"社会","author_name":"生活小黄雀","url":"http://mini.eastday.com/mobile/171225180044620.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225_0e733c9552916318d07f601b77aae8e1_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171225/20171225_8d96f8fe6afd04561fba1827be56d84d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171225/20171225_9c5db403143ad39e1c8e036dc3073046_cover_mwpm_03200403.jpg"},{"uniquekey":"68bb4ef59c8a8ad7ce65439fcd01c6f1","title":"农民：我从未见过脾气如此暴躁的橘子","date":"2017-12-25 18:00","category":"社会","author_name":"农村阿冬","url":"http://mini.eastday.com/mobile/171225180021517.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171225/20171225180021_431114f317c3a7bd795db7a42a3ca9f5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171225/20171225180021_431114f317c3a7bd795db7a42a3ca9f5_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171225/20171225180021_431114f317c3a7bd795db7a42a3ca9f5_2_mwpm_03200403.jpg"},{"uniquekey":"f5d66054fb68f8a330483de92a5fa40d","title":"真人版蜘蛛侠！年近60还能\u201c飞崖走壁\u201d！","date":"2017-12-25 17:57","category":"社会","author_name":"云台山风景名胜区","url":"http://mini.eastday.com/mobile/171225175721357.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171225/20171225175721_82869b498c5facff410d8f6a80982e33_9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171225/20171225175721_82869b498c5facff410d8f6a80982e33_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20171225/20171225175721_82869b498c5facff410d8f6a80982e33_4_mwpm_03200403.jpg"},{"uniquekey":"8cdc09febbdeecfc17d8423b63bbf2f7","title":"新郎街头被人用鸡蛋砸，全身倒满酱油和醋，原因却让人感到意外","date":"2017-12-25 17:56","category":"社会","author_name":"爱生活爱美好的","url":"http://mini.eastday.com/mobile/171225175650179.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171225/20171225175650_20c1ab682a06d7660d599e4d6a466609_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171225/20171225175650_20c1ab682a06d7660d599e4d6a466609_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171225/20171225175650_20c1ab682a06d7660d599e4d6a466609_4_mwpm_03200403.jpg"},{"uniquekey":"d8b0eb996fcdc133d66d38ab2de4a548","title":"少女与男子发生一夜情，看到钱后报警自己却被抓","date":"2017-12-25 17:56","category":"社会","author_name":"杀生丸","url":"http://mini.eastday.com/mobile/171225175615340.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225_93e461f08d1a32196828ad0b094154bd_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171225/20171225_9dad7f0ba20375302b7ad9c51aa1275d_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171225/20171225_cbf37e2b27374042cac0e9c8a825b9af_mwpm_03200403.jpg"},{"uniquekey":"d305c26c92a3382ccab06d5f0cdc4252","title":"机关事业单位人际关系是怎样的？","date":"2017-12-25 17:56","category":"社会","author_name":"事业单位信息汇总","url":"http://mini.eastday.com/mobile/171225175611844.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225175611_900bc9f0ca411715e1e7faf0ef2486a7_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171225/20171225175611_900bc9f0ca411715e1e7faf0ef2486a7_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171225/20171225175611_900bc9f0ca411715e1e7faf0ef2486a7_1_mwpm_03200403.jpg"},{"uniquekey":"a7881157104322d4d84b5b9f72982620","title":"女子练车遇骚扰  教练要与其谈恋爱","date":"2017-12-25 17:56","category":"社会","author_name":"招风耳","url":"http://mini.eastday.com/mobile/171225175610149.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225_7d18fa9cb3ca096d5f2a1532bdc5234d_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171225/20171225_46e71b13f6d006dba778b82caae1c75d_cover_mwpm_03200403.jpg"},{"uniquekey":"90a4cfe0c758388d2dc9b1055a60aeac","title":"淄博淄川：冬游马鞍山","date":"2017-12-25 17:56","category":"社会","author_name":"淄川小V","url":"http://mini.eastday.com/mobile/171225175604142.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225175604_2b14ced77f282edc0603afcbcd6c5213_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171225/20171225175604_2b14ced77f282edc0603afcbcd6c5213_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171225/20171225175604_2b14ced77f282edc0603afcbcd6c5213_1_mwpm_03200403.jpg"},{"uniquekey":"47c4340482a21708b75138f0761c1eee","title":"\u201c女儿住院给妈妈发信息被拉黑\u201d尘肺病爸爸病房外哭泣","date":"2017-12-25 17:55","category":"社会","author_name":"看图吧","url":"http://mini.eastday.com/mobile/171225175508509.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225175508_44be7f7e12fbff465c4fa27e54c5526a_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171225/20171225175508_44be7f7e12fbff465c4fa27e54c5526a_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171225/20171225175508_44be7f7e12fbff465c4fa27e54c5526a_2_mwpm_03200403.jpg"},{"uniquekey":"f8367bb6401f9793ea87e3e3bf63f314","title":"科普一点房地产知识，帮助你们理解《杭州保姆纵火案律师退场》","date":"2017-12-25 17:54","category":"社会","author_name":"镖哥说事","url":"http://mini.eastday.com/mobile/171225175403482.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171225/20171225175403_55a4cd428c48599cfd0db59bf8340395_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171225/20171225175403_55a4cd428c48599cfd0db59bf8340395_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171225/20171225175403_55a4cd428c48599cfd0db59bf8340395_4_mwpm_03200403.jpg"},{"uniquekey":"8a0940d2d3263b6f0147d2e5def5fcf5","title":"积善成德 书法家王焱泼墨义卖资助周至贫困学生","date":"2017-12-25 17:53","category":"社会","author_name":"西安商网","url":"http://mini.eastday.com/mobile/171225175338420.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225175338_1171d296aa7d9d3753560af2ac7155b9_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171225/20171225175338_1171d296aa7d9d3753560af2ac7155b9_21_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171225/20171225175338_1171d296aa7d9d3753560af2ac7155b9_27_mwpm_03200403.jpg"},{"uniquekey":"7328d59fcc5fd182636fd05361a645de","title":"「普法宣传」不学反恐怖主义法，后果很严重","date":"2017-12-25 17:53","category":"社会","author_name":"平安自贡","url":"http://mini.eastday.com/mobile/171225175312330.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171225/20171225175312_0f92e573d9a374b0b769fa59d19dd785_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171225/20171225175312_0f92e573d9a374b0b769fa59d19dd785_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171225/20171225175312_0f92e573d9a374b0b769fa59d19dd785_5_mwpm_03200403.jpg"},{"uniquekey":"f1cd5eb5ea78bf5d0b5114190d3518d6","title":"人间大爱 传播正能量","date":"2017-12-25 17:53","category":"社会","author_name":"前沿客户端","url":"http://mini.eastday.com/mobile/171225175310836.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225175310_20eec01bf520798dd0a439c69474b853_1_mwpm_03200403.jpg"},{"uniquekey":"e482ded4e8c3d8da3ce7a9806b691d8a","title":"新疆吉木萨尔县医院免费送医送药到亲戚家门口","date":"2017-12-25 17:50","category":"社会","author_name":"亚心网","url":"http://mini.eastday.com/mobile/171225175056116.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171225/20171225175056_febd73a34ba88897edc49b30b6b5f5fa_1_mwpm_03200403.jpg"},{"uniquekey":"38ece097b04c1af351988208400a8577","title":"东山岛东山岛\u2014\u2014风动海动心动","date":"2017-12-25 17:50","category":"社会","author_name":"内蒙古新闻网","url":"http://mini.eastday.com/mobile/171225175046704.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171225/20171225175046_cd24ae18c8e3f62ec73bb0ef25b44c39_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171225/20171225175046_cd24ae18c8e3f62ec73bb0ef25b44c39_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20171225/20171225175046_cd24ae18c8e3f62ec73bb0ef25b44c39_1_mwpm_03200403.jpg"},{"uniquekey":"cf5348f7b962d0d1195dc68b60ebf563","title":"男子在直播中意外发现女友，而后发现女友被人强奸","date":"2017-12-25 17:50","category":"社会","author_name":"耶梦加得","url":"http://mini.eastday.com/mobile/171225175041211.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171225/20171225_b1262fc4ffe74c2f78ca6e896e2c41cc_mwpm_03200403.jpg"},{"uniquekey":"989e0925580faa1d3a5809d53826db5a","title":"中俄青年迎新年活动在京举行","date":"2017-12-25 17:47","category":"社会","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/171225174709436.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171225/20171225174709_a57fe94948eb3dc6ab5e86941ff19ce0_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171225/20171225174709_33d7080dda5247c64da7b9f80153b5f8_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171225/20171225174709_4ec9e97b606d8583cb33e068090d4f99_2_mwpm_03200403.jpg"},{"uniquekey":"c3418b31ff8bc74ecbc438254d040540","title":"看插画，长知识，了解各国独特而富有创意的圣诞节习俗","date":"2017-12-25 17:45","category":"社会","author_name":"搜狐","url":"http://mini.eastday.com/mobile/171225174501141.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171225/20171225174501_28e72668f375d3b6580b7d88657ec53a_18_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171225/20171225174501_28e72668f375d3b6580b7d88657ec53a_12_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20171225/20171225174501_28e72668f375d3b6580b7d88657ec53a_1_mwpm_03200403.jpg"},{"uniquekey":"ebd22981927e3c7e06b3d8455dac4ad9","title":"中国油画：陈逸飞 是让诗歌流动的画家","date":"2017-12-25 17:44","category":"社会","author_name":"搜狐","url":"http://mini.eastday.com/mobile/171225174454102.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171225/20171225174454_7d4587902ca45084ef92c51e58d0078a_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171225/20171225174454_7d4587902ca45084ef92c51e58d0078a_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171225/20171225174454_7d4587902ca45084ef92c51e58d0078a_7_mwpm_03200403.jpg"},{"uniquekey":"1a4247e71cf73e40f795865ae46de071","title":"93岁老人苦寻爱人77年,最后《山楂花》响起瞬间泪奔!","date":"2017-12-25 17:43","category":"社会","author_name":"杭州日报微信公众号","url":"http://mini.eastday.com/mobile/171225174354827.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225174354_4b34b4ef9f3b7f65b25612c45d768d78_1_mwpm_03200403.jpg"},{"uniquekey":"ed9e21aa5c869ab8156d1e239c0e4406","title":"临近春节！小偷偷手机又出新招了 看看如何防止被偷","date":"2017-12-25 17:42","category":"社会","author_name":"中原网","url":"http://mini.eastday.com/mobile/171225174205753.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171225/20171225174205_76312b2b425e5362159f5f0f0ce48efd_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171225/20171225174205_76312b2b425e5362159f5f0f0ce48efd_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20171225/20171225174205_76312b2b425e5362159f5f0f0ce48efd_2_mwpm_03200403.jpg"},{"uniquekey":"1ac5466eb043731d7cb2a7ef229f408a","title":"男孩跳楼半个身子挂窗外 母亲一把拉住拖半个小时","date":"2017-12-25 17:41","category":"社会","author_name":"杭州日报","url":"http://mini.eastday.com/mobile/171225174154730.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171225/20171225174154_762cdf823ad245dc11eeb6f9770ad778_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171225/20171225174154_762cdf823ad245dc11eeb6f9770ad778_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171225/20171225174154_762cdf823ad245dc11eeb6f9770ad778_2_mwpm_03200403.jpg"},{"uniquekey":"88029e959028fe2813417ef8323d15fe","title":"调查显示\"70后\"\"80后\"子女课外辅导需求集中","date":"2017-12-25 17:41","category":"社会","author_name":"新民晚报","url":"http://mini.eastday.com/mobile/171225174153306.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225174153_34cfe26a304526f3e3e10d8c260bd398_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171225/20171225174153_34cfe26a304526f3e3e10d8c260bd398_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171225/20171225174153_34cfe26a304526f3e3e10d8c260bd398_2_mwpm_03200403.jpg"},{"uniquekey":"a48e2dd2e122493d76cffa050254daa0","title":"为和儿子争亡妻房产 男子找假儿子打官司被判\u201c虚假诉讼\u201d","date":"2017-12-25 17:41","category":"社会","author_name":"律师说","url":"http://mini.eastday.com/mobile/171225174114294.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171225/20171225174114_fbb1ac4adda356bc557e310559f7ced9_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171225/20171225174114_fbb1ac4adda356bc557e310559f7ced9_2_mwpm_03200403.jpg"},{"uniquekey":"0d7d66f42a0fad40bbba106f18feed42","title":"丈夫成植物人三年   妻子却突然怀孕了","date":"2017-12-25 17:40","category":"社会","author_name":"招风耳","url":"http://mini.eastday.com/mobile/171225174008277.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225_11d0b7cd635e0eef08457c1ec13281d7_cover_mwpm_03200403.jpg"},{"uniquekey":"4ed33e44ee78001e51bca505bd613825","title":"有一种思念叫作回家杀年猪~","date":"2017-12-25 17:38","category":"社会","author_name":"宁国市文旅委","url":"http://mini.eastday.com/mobile/171225173845931.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171225/20171225173845_ec94fdcf0e1a85b77585ecdecf3fd1ca_13_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171225/20171225173845_ec94fdcf0e1a85b77585ecdecf3fd1ca_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20171225/20171225173845_ec94fdcf0e1a85b77585ecdecf3fd1ca_3_mwpm_03200403.jpg"},{"uniquekey":"bb356384b9bf08e107c4b184d5be2556","title":"冉莹颖怒斥经纪公司不拿邹市明当人，逼迫比赛还拖欠工资","date":"2017-12-25 17:38","category":"社会","author_name":"耶梦加得","url":"http://mini.eastday.com/mobile/171225173817330.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225_c5cbfbd084a2d3f04d8c5ed7c80be81a_mwpm_03200403.jpg"},{"uniquekey":"3e9fb979dba248ee4c5cb141e1460008","title":"情暖人心，检察干警送来4万元司法救助金\u2026\u2026","date":"2017-12-25 17:37","category":"社会","author_name":"日照市人民检察院","url":"http://mini.eastday.com/mobile/171225173722793.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225173722_833996f6865b95b1c83cf4b132802d8b_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171225/20171225173722_833996f6865b95b1c83cf4b132802d8b_1_mwpm_03200403.jpg"},{"uniquekey":"b59f941cd2d6e00e785bbdf6a010c112","title":"男子醉驾撞四车 宝鸡交警破窗擒人","date":"2017-12-25 17:37","category":"社会","author_name":"宝鸡新闻网","url":"http://mini.eastday.com/mobile/171225173711264.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225_c34990faab62256fcbda0f89d29b0d2c_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171225/20171225_ed6022654d15a140b16941da93c6e92a_cover_mwpm_03200403.jpg"},{"uniquekey":"06dce6e1acb182853ab56db760e5cd28","title":"比亚迪车主去车管所上牌，看到候选号码后，周围的人羡慕不已！","date":"2017-12-25 17:34","category":"社会","author_name":"不等于世界","url":"http://mini.eastday.com/mobile/171225173431734.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225173431_30299f32448ce11bf244427b3b6a7862_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171225/20171225173431_30299f32448ce11bf244427b3b6a7862_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171225/20171225173431_30299f32448ce11bf244427b3b6a7862_1_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"8d9c808945b86c81f08eb71fcc9517b1","title":"农村男子奇装异服，展示一场山村维秘秀，众人表示不忍直视","date":"2017-12-25 18:00","category":"社会","author_name":"生活小黄雀","url":"http://mini.eastday.com/mobile/171225180044620.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225_0e733c9552916318d07f601b77aae8e1_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171225/20171225_8d96f8fe6afd04561fba1827be56d84d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171225/20171225_9c5db403143ad39e1c8e036dc3073046_cover_mwpm_03200403.jpg"},{"uniquekey":"68bb4ef59c8a8ad7ce65439fcd01c6f1","title":"农民：我从未见过脾气如此暴躁的橘子","date":"2017-12-25 18:00","category":"社会","author_name":"农村阿冬","url":"http://mini.eastday.com/mobile/171225180021517.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171225/20171225180021_431114f317c3a7bd795db7a42a3ca9f5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171225/20171225180021_431114f317c3a7bd795db7a42a3ca9f5_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171225/20171225180021_431114f317c3a7bd795db7a42a3ca9f5_2_mwpm_03200403.jpg"},{"uniquekey":"f5d66054fb68f8a330483de92a5fa40d","title":"真人版蜘蛛侠！年近60还能\u201c飞崖走壁\u201d！","date":"2017-12-25 17:57","category":"社会","author_name":"云台山风景名胜区","url":"http://mini.eastday.com/mobile/171225175721357.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171225/20171225175721_82869b498c5facff410d8f6a80982e33_9_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171225/20171225175721_82869b498c5facff410d8f6a80982e33_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20171225/20171225175721_82869b498c5facff410d8f6a80982e33_4_mwpm_03200403.jpg"},{"uniquekey":"8cdc09febbdeecfc17d8423b63bbf2f7","title":"新郎街头被人用鸡蛋砸，全身倒满酱油和醋，原因却让人感到意外","date":"2017-12-25 17:56","category":"社会","author_name":"爱生活爱美好的","url":"http://mini.eastday.com/mobile/171225175650179.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171225/20171225175650_20c1ab682a06d7660d599e4d6a466609_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171225/20171225175650_20c1ab682a06d7660d599e4d6a466609_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171225/20171225175650_20c1ab682a06d7660d599e4d6a466609_4_mwpm_03200403.jpg"},{"uniquekey":"d8b0eb996fcdc133d66d38ab2de4a548","title":"少女与男子发生一夜情，看到钱后报警自己却被抓","date":"2017-12-25 17:56","category":"社会","author_name":"杀生丸","url":"http://mini.eastday.com/mobile/171225175615340.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225_93e461f08d1a32196828ad0b094154bd_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171225/20171225_9dad7f0ba20375302b7ad9c51aa1275d_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171225/20171225_cbf37e2b27374042cac0e9c8a825b9af_mwpm_03200403.jpg"},{"uniquekey":"d305c26c92a3382ccab06d5f0cdc4252","title":"机关事业单位人际关系是怎样的？","date":"2017-12-25 17:56","category":"社会","author_name":"事业单位信息汇总","url":"http://mini.eastday.com/mobile/171225175611844.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225175611_900bc9f0ca411715e1e7faf0ef2486a7_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171225/20171225175611_900bc9f0ca411715e1e7faf0ef2486a7_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171225/20171225175611_900bc9f0ca411715e1e7faf0ef2486a7_1_mwpm_03200403.jpg"},{"uniquekey":"a7881157104322d4d84b5b9f72982620","title":"女子练车遇骚扰  教练要与其谈恋爱","date":"2017-12-25 17:56","category":"社会","author_name":"招风耳","url":"http://mini.eastday.com/mobile/171225175610149.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225_7d18fa9cb3ca096d5f2a1532bdc5234d_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171225/20171225_46e71b13f6d006dba778b82caae1c75d_cover_mwpm_03200403.jpg"},{"uniquekey":"90a4cfe0c758388d2dc9b1055a60aeac","title":"淄博淄川：冬游马鞍山","date":"2017-12-25 17:56","category":"社会","author_name":"淄川小V","url":"http://mini.eastday.com/mobile/171225175604142.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225175604_2b14ced77f282edc0603afcbcd6c5213_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171225/20171225175604_2b14ced77f282edc0603afcbcd6c5213_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20171225/20171225175604_2b14ced77f282edc0603afcbcd6c5213_1_mwpm_03200403.jpg"},{"uniquekey":"47c4340482a21708b75138f0761c1eee","title":"\u201c女儿住院给妈妈发信息被拉黑\u201d尘肺病爸爸病房外哭泣","date":"2017-12-25 17:55","category":"社会","author_name":"看图吧","url":"http://mini.eastday.com/mobile/171225175508509.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225175508_44be7f7e12fbff465c4fa27e54c5526a_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171225/20171225175508_44be7f7e12fbff465c4fa27e54c5526a_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171225/20171225175508_44be7f7e12fbff465c4fa27e54c5526a_2_mwpm_03200403.jpg"},{"uniquekey":"f8367bb6401f9793ea87e3e3bf63f314","title":"科普一点房地产知识，帮助你们理解《杭州保姆纵火案律师退场》","date":"2017-12-25 17:54","category":"社会","author_name":"镖哥说事","url":"http://mini.eastday.com/mobile/171225175403482.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20171225/20171225175403_55a4cd428c48599cfd0db59bf8340395_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20171225/20171225175403_55a4cd428c48599cfd0db59bf8340395_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20171225/20171225175403_55a4cd428c48599cfd0db59bf8340395_4_mwpm_03200403.jpg"},{"uniquekey":"8a0940d2d3263b6f0147d2e5def5fcf5","title":"积善成德 书法家王焱泼墨义卖资助周至贫困学生","date":"2017-12-25 17:53","category":"社会","author_name":"西安商网","url":"http://mini.eastday.com/mobile/171225175338420.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225175338_1171d296aa7d9d3753560af2ac7155b9_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171225/20171225175338_1171d296aa7d9d3753560af2ac7155b9_21_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171225/20171225175338_1171d296aa7d9d3753560af2ac7155b9_27_mwpm_03200403.jpg"},{"uniquekey":"7328d59fcc5fd182636fd05361a645de","title":"「普法宣传」不学反恐怖主义法，后果很严重","date":"2017-12-25 17:53","category":"社会","author_name":"平安自贡","url":"http://mini.eastday.com/mobile/171225175312330.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20171225/20171225175312_0f92e573d9a374b0b769fa59d19dd785_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20171225/20171225175312_0f92e573d9a374b0b769fa59d19dd785_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20171225/20171225175312_0f92e573d9a374b0b769fa59d19dd785_5_mwpm_03200403.jpg"},{"uniquekey":"f1cd5eb5ea78bf5d0b5114190d3518d6","title":"人间大爱 传播正能量","date":"2017-12-25 17:53","category":"社会","author_name":"前沿客户端","url":"http://mini.eastday.com/mobile/171225175310836.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225175310_20eec01bf520798dd0a439c69474b853_1_mwpm_03200403.jpg"},{"uniquekey":"e482ded4e8c3d8da3ce7a9806b691d8a","title":"新疆吉木萨尔县医院免费送医送药到亲戚家门口","date":"2017-12-25 17:50","category":"社会","author_name":"亚心网","url":"http://mini.eastday.com/mobile/171225175056116.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171225/20171225175056_febd73a34ba88897edc49b30b6b5f5fa_1_mwpm_03200403.jpg"},{"uniquekey":"38ece097b04c1af351988208400a8577","title":"东山岛东山岛\u2014\u2014风动海动心动","date":"2017-12-25 17:50","category":"社会","author_name":"内蒙古新闻网","url":"http://mini.eastday.com/mobile/171225175046704.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171225/20171225175046_cd24ae18c8e3f62ec73bb0ef25b44c39_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171225/20171225175046_cd24ae18c8e3f62ec73bb0ef25b44c39_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20171225/20171225175046_cd24ae18c8e3f62ec73bb0ef25b44c39_1_mwpm_03200403.jpg"},{"uniquekey":"cf5348f7b962d0d1195dc68b60ebf563","title":"男子在直播中意外发现女友，而后发现女友被人强奸","date":"2017-12-25 17:50","category":"社会","author_name":"耶梦加得","url":"http://mini.eastday.com/mobile/171225175041211.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171225/20171225_b1262fc4ffe74c2f78ca6e896e2c41cc_mwpm_03200403.jpg"},{"uniquekey":"989e0925580faa1d3a5809d53826db5a","title":"中俄青年迎新年活动在京举行","date":"2017-12-25 17:47","category":"社会","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/171225174709436.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171225/20171225174709_a57fe94948eb3dc6ab5e86941ff19ce0_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171225/20171225174709_33d7080dda5247c64da7b9f80153b5f8_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171225/20171225174709_4ec9e97b606d8583cb33e068090d4f99_2_mwpm_03200403.jpg"},{"uniquekey":"c3418b31ff8bc74ecbc438254d040540","title":"看插画，长知识，了解各国独特而富有创意的圣诞节习俗","date":"2017-12-25 17:45","category":"社会","author_name":"搜狐","url":"http://mini.eastday.com/mobile/171225174501141.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171225/20171225174501_28e72668f375d3b6580b7d88657ec53a_18_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171225/20171225174501_28e72668f375d3b6580b7d88657ec53a_12_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20171225/20171225174501_28e72668f375d3b6580b7d88657ec53a_1_mwpm_03200403.jpg"},{"uniquekey":"ebd22981927e3c7e06b3d8455dac4ad9","title":"中国油画：陈逸飞 是让诗歌流动的画家","date":"2017-12-25 17:44","category":"社会","author_name":"搜狐","url":"http://mini.eastday.com/mobile/171225174454102.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171225/20171225174454_7d4587902ca45084ef92c51e58d0078a_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171225/20171225174454_7d4587902ca45084ef92c51e58d0078a_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20171225/20171225174454_7d4587902ca45084ef92c51e58d0078a_7_mwpm_03200403.jpg"},{"uniquekey":"1a4247e71cf73e40f795865ae46de071","title":"93岁老人苦寻爱人77年,最后《山楂花》响起瞬间泪奔!","date":"2017-12-25 17:43","category":"社会","author_name":"杭州日报微信公众号","url":"http://mini.eastday.com/mobile/171225174354827.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225174354_4b34b4ef9f3b7f65b25612c45d768d78_1_mwpm_03200403.jpg"},{"uniquekey":"ed9e21aa5c869ab8156d1e239c0e4406","title":"临近春节！小偷偷手机又出新招了 看看如何防止被偷","date":"2017-12-25 17:42","category":"社会","author_name":"中原网","url":"http://mini.eastday.com/mobile/171225174205753.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171225/20171225174205_76312b2b425e5362159f5f0f0ce48efd_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171225/20171225174205_76312b2b425e5362159f5f0f0ce48efd_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20171225/20171225174205_76312b2b425e5362159f5f0f0ce48efd_2_mwpm_03200403.jpg"},{"uniquekey":"1ac5466eb043731d7cb2a7ef229f408a","title":"男孩跳楼半个身子挂窗外 母亲一把拉住拖半个小时","date":"2017-12-25 17:41","category":"社会","author_name":"杭州日报","url":"http://mini.eastday.com/mobile/171225174154730.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171225/20171225174154_762cdf823ad245dc11eeb6f9770ad778_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171225/20171225174154_762cdf823ad245dc11eeb6f9770ad778_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171225/20171225174154_762cdf823ad245dc11eeb6f9770ad778_2_mwpm_03200403.jpg"},{"uniquekey":"88029e959028fe2813417ef8323d15fe","title":"调查显示\"70后\"\"80后\"子女课外辅导需求集中","date":"2017-12-25 17:41","category":"社会","author_name":"新民晚报","url":"http://mini.eastday.com/mobile/171225174153306.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225174153_34cfe26a304526f3e3e10d8c260bd398_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171225/20171225174153_34cfe26a304526f3e3e10d8c260bd398_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20171225/20171225174153_34cfe26a304526f3e3e10d8c260bd398_2_mwpm_03200403.jpg"},{"uniquekey":"a48e2dd2e122493d76cffa050254daa0","title":"为和儿子争亡妻房产 男子找假儿子打官司被判\u201c虚假诉讼\u201d","date":"2017-12-25 17:41","category":"社会","author_name":"律师说","url":"http://mini.eastday.com/mobile/171225174114294.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171225/20171225174114_fbb1ac4adda356bc557e310559f7ced9_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171225/20171225174114_fbb1ac4adda356bc557e310559f7ced9_2_mwpm_03200403.jpg"},{"uniquekey":"0d7d66f42a0fad40bbba106f18feed42","title":"丈夫成植物人三年   妻子却突然怀孕了","date":"2017-12-25 17:40","category":"社会","author_name":"招风耳","url":"http://mini.eastday.com/mobile/171225174008277.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171225/20171225_11d0b7cd635e0eef08457c1ec13281d7_cover_mwpm_03200403.jpg"},{"uniquekey":"4ed33e44ee78001e51bca505bd613825","title":"有一种思念叫作回家杀年猪~","date":"2017-12-25 17:38","category":"社会","author_name":"宁国市文旅委","url":"http://mini.eastday.com/mobile/171225173845931.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20171225/20171225173845_ec94fdcf0e1a85b77585ecdecf3fd1ca_13_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20171225/20171225173845_ec94fdcf0e1a85b77585ecdecf3fd1ca_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20171225/20171225173845_ec94fdcf0e1a85b77585ecdecf3fd1ca_3_mwpm_03200403.jpg"},{"uniquekey":"bb356384b9bf08e107c4b184d5be2556","title":"冉莹颖怒斥经纪公司不拿邹市明当人，逼迫比赛还拖欠工资","date":"2017-12-25 17:38","category":"社会","author_name":"耶梦加得","url":"http://mini.eastday.com/mobile/171225173817330.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225_c5cbfbd084a2d3f04d8c5ed7c80be81a_mwpm_03200403.jpg"},{"uniquekey":"3e9fb979dba248ee4c5cb141e1460008","title":"情暖人心，检察干警送来4万元司法救助金\u2026\u2026","date":"2017-12-25 17:37","category":"社会","author_name":"日照市人民检察院","url":"http://mini.eastday.com/mobile/171225173722793.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20171225/20171225173722_833996f6865b95b1c83cf4b132802d8b_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20171225/20171225173722_833996f6865b95b1c83cf4b132802d8b_1_mwpm_03200403.jpg"},{"uniquekey":"b59f941cd2d6e00e785bbdf6a010c112","title":"男子醉驾撞四车 宝鸡交警破窗擒人","date":"2017-12-25 17:37","category":"社会","author_name":"宝鸡新闻网","url":"http://mini.eastday.com/mobile/171225173711264.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225_c34990faab62256fcbda0f89d29b0d2c_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171225/20171225_ed6022654d15a140b16941da93c6e92a_cover_mwpm_03200403.jpg"},{"uniquekey":"06dce6e1acb182853ab56db760e5cd28","title":"比亚迪车主去车管所上牌，看到候选号码后，周围的人羡慕不已！","date":"2017-12-25 17:34","category":"社会","author_name":"不等于世界","url":"http://mini.eastday.com/mobile/171225173431734.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171225/20171225173431_30299f32448ce11bf244427b3b6a7862_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171225/20171225173431_30299f32448ce11bf244427b3b6a7862_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20171225/20171225173431_30299f32448ce11bf244427b3b6a7862_1_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 8d9c808945b86c81f08eb71fcc9517b1
             * title : 农村男子奇装异服，展示一场山村维秘秀，众人表示不忍直视
             * date : 2017-12-25 18:00
             * category : 社会
             * author_name : 生活小黄雀
             * url : http://mini.eastday.com/mobile/171225180044620.html
             * thumbnail_pic_s : http://07.imgmini.eastday.com/mobile/20171225/20171225_0e733c9552916318d07f601b77aae8e1_cover_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://07.imgmini.eastday.com/mobile/20171225/20171225_8d96f8fe6afd04561fba1827be56d84d_cover_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://07.imgmini.eastday.com/mobile/20171225/20171225_9c5db403143ad39e1c8e036dc3073046_cover_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }
    }

    @Override
    public String toString() {
        return "GetBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                ", error_code=" + result.getData().toString() +
                '}';
    }
}
