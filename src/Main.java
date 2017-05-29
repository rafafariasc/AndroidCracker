public class Main {

    public static void main(String[] args) {
        String baseText = "ybnmukamysncjwuiisaagjjdnduvyflnjgditbauolyxpatuximwdrnmunwxjmwuomwnmedp\n" +
                "lewmujtjintjjjtfrejugmbqbqvestbavowjeopnuieylqbxyxnovywinkvuiicxrktzpijj\n" +
                "vykqlauvyhysqhywipatuximwdrattbwotqenpxsljrnhowmtujthbjhnsgiqiadjuysubey\n" +
                "qsdaktgubjqarylhnpxonnjfwywtoxwdrattmebyiexpxsfnwqplhtmnduruwawayilehaiw\n" +
                "mfdmcuthafhurnmuuemxyduuqbxyxnzghpnyoivyhquhktsiadjohijqakljncjwohijqase\n" +
                "wncjwkywucdkvnrmptosluwayyxahzwcxxqrzruytbahsvjqoexcfmyjjwhyxniotxtibjvy\n" +
                "bqcaxifnxhuhcytrrotjtbamonjhbbxertbamonjhbckdjscoqbxlemigtjtbavwlrqvatjf\n" +
                "nxzyjciumpnubanahgqmyldcuweojtslyxnbohragadhzwevpnubanahgqmyldcuweuxejyy\n" +
                "xnbohragadhustrpcqxsicubyxybwttloxyqzfjtcdkvnrgwcshyxnwbusahzjvyjlnjodla\n" +
                "hzjvyreajodlwynuhbjinyudiduuwshjirogdigiziocibnpzxjwupufmzdmaxjmebaqjysr\n" +
                "ncgjmelathilucdkhznnkebyubjykqsdfajhbjtaurqsdulfsuwqwzojbamoeuysubeyqsda\n" +
                "ktquqbnzzxjdlubohiujnzxfnxpxsafjqaxysgnkwsnmuakljmeqwjslxsjhruihyouomfdm\n" +
                "cutxaqpxonnjfwywtoxcubyxybwttloxoqwxqucpnujalpxplndpbuhyhanqgmyxndkhgyca\n" +
                "brcswbaktfnxpxszwkrpzhjeseuzxndpbxkntubjslmybgodiwbkismjumeyysinouzzzfxj\n" +
                "zxjeunjvustrpcqxsicubyxybwttyhyaqfnmrakawmtzkhhblhjoyqsdbahpsnuuzodlsyat\n" +
                "ozyuadoipihzqbxyxnpxujycabrcswonayywbkismjumsginncpisfkqopkhmimgybxfdmcu\n" +
                "txaqpxonnjfwywtoxcubyxybwttyhyalshndpwttyhyiefhndpskhjtbajvcwtmwewjnyoyg\n" +
                "ustpkjifixhuhnmuaahuqiadjgcsjqalywmuiubntvcdkxjapadhiiyeejuyhyzqmzwevpnu\n" +
                "siadjohibnpzxjmvavclxypjyqsdzkhgyfixjyqsdzkhrudijjjojalowshjirogdilypjvy\n" +
                "rrnbuhqiadjgcsjqalywmuiubntvcdkxjapadhilyearylhnqfchyxnaghyhujtwnbqbouwj\n" +
                "nyoygustpkjcfdypmcawujprylhnojvylhnwzuwlccxhnthdhkjmexwoohijqaruxsynbwam\n" +
                "jckxkqendubclxcdkcfdypxsmyqaogbxoaadsmnijjjwtdmajhbjcrjzxjfcncogjdckljme\n" +
                "baqjysjxcoljlccxhouewpnujalpxuysubeyqsdnkhifjeeaxjmexwoohieeaxjmehewvnfd\n" +
                "mputnvczuhbjbrcnjkriijvyiqagtuxsujtuiiijszxftcpmomlexzmusemeiohijqakljnc\n" +
                "jwohijqasewncjwkywucdkvtulpxrudwnjkinsujtuiiijejbjtndukuyuaohhnnabefnmqk\n" +
                "qttfnnhohbjcxrodlclaqhowucdgjmandbwzjqwzleblndqhgfooheqgopajvyjqapnystba\n" +
                "edysvrnsqrehpetbjqeatwjnyoygustpkjsweupurawujpcxflyoqbxjlnnebnvcjwqljqcq\n" +
                "xuyhupccpjjqsnyhhndukuyuaohhtuadjtiwjqwhksdujjzsfvcaxjmecnawhiqwzkljrssy\n" +
                "bajtokcbffnahvcxarjjqsdaktgubjqwzyywuowciiwnjkinsujtuiiruayijdnduamforjm\n" +
                "rjflqyhzzbjjjczlnefzsfdmbobqtbamonjhbetjmemaqgustuazvtwfikznnfuuodyhyaqf\n" +
                "nmwnjkinsujthbjueatysgujthbjcxntysgqahsnmuoeljmduuwshjirogdigiziocibnpzx\n" +
                "jeunjvvwywclewtbpxsfnlrjmsweupkfyfvcaxxnseedrwfjchkqsdwnusjndppnysgujtpy\n" +
                "fickljmeywhhbfvcaxxnseedrustrpcqxsicubyxybwttloxiqryyxnxkqxtibjvyjqapnqk\n" +
                "tynxwmpywzgdicupjzyfvcaxjmecnawhiqwzkljrspxwhljqwzsweyluhbzfxjzxjeunjvuk\n" +
                "jnnnyxkcjtohiwxzyqbtbwjwnbqbcueigyjugcxqwzmeisuetzyykbigajmujybizhrigwja\n" +
                "zpufizhuequsemoqbxqucpnurhururiryweudtvynjvykybduvyhyououstxrkhyhybekftv\n" +
                "cdkqnrujtcpjhcdksftnhuohieeaxqqlndusuwjqwtttvynujywolnkuuihcjvcswcdgjhry\n" +
                "afsnmkyktjmeywhhbluwayyxsicerwwujpktrahedvcxefjocfgyedhbjyvwmutfaktqljqc\n" +
                "ajxjhcicofjqwzlurafasfyfjnznuyhyiwshjirogdigizrzyxinzzxjmujtuiiijejkstip\n" +
                "xsgguonayyfohqbxrkupofqyujtfyubnjoimtbauolyxjjjizbxquwnfdmdgljdiiybctdxr\n" +
                "khyhybygbtvcdkijaujtcpjhcdkvtwfkvhbjqrngdiopahspjhhholnnapxwhljqwzctvypx\n" +
                "ijtdcdkufrndwshjirogdigiziocirndubiibwlsanlnjeezepahmbjhkxkqwihcisyimqei\n" +
                "xnsolebnmuowiutfuhbhbjujnzxfnxalsldtjjjwtdmwmhbf";

        System.out.println(baseText);
    }
}
