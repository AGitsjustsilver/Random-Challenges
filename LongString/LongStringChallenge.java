import java.util.Scanner;
import java.util.ArrayList;

    /**
     * Challenge
     * 
     * Sort the String containing the characters a-z including _
     * 
     * by the number of times the character appears in the text (Descending)
     * 
     * take the sorted String, and drop all the character after (and including) the_.
     * The remaining word is the answer.
     * 
     **/
     
     /**
      * Here is an example for testing
      * "cwrxwzbgickpjbp_svnudntddwdqbfgzyiqpuxddmpvyfquosmicfzkjekxzchngpqaksafulateukuwomdrwza_n_ptzktjzcuibnebe_tqessrzqewgkadrkvtyznaupodanwazopg_fijcoojojbsolr_ejesukzc_quochdnmti_lkvrsegyieqlqysuxdvetkqtkhxaiypfdiddztlicjurnllriopdtuuzpryrsepfydyeg_xkr_ruxp_lgqesysidfsygztwrba_ay_gaqqklbrvr_lbhawjraqujfxptmuvqfzklfodgaqrnhjravksjwemoosdlxtvw_qspxmlvqryusfixzlkb_p_c_tepzozzwnokvqspkizygoqpbhjnsxopchzgapctowbrletrunlgnvzpfwrqgedo_s_ygkxz_mpncnve_gfpbotupawevhfxvqhwlerupjfibosbvhiijrodigzyhy_iijes_xsqorshhdzkjqitpljsftpitjetwmzqiabyiewgtbjaddtsjkckcxxvlyrchloetluxkohn_uihkdjpcqgvejanslakmwendgkmvmayknvjjnr_kdapnumwvz__lsimxdtrflyleykxejl_jbkhexpcyreoapelqzzyriyrbxdgbgwrrxlj_pt_mpwubvbveakxfsbfgj___xfqilxpzalazduzucgoxz_yzhkjwamosiwclkicifmebonobknqokyevtwmekackk_kezmjkgmtgaouerwlwfkaaqhkghreoqhfjzpxrlzmbgfpvofpxkmz_cnvcvfsuokpcaimnvdxeizbbgudln__wvkrqpijlncdacmsvytdxmu_zkvzilfrymoxzlovfhdzuarqumibrcvuqfcxdcrvw_ehbwhwjoanluezhthzkpuqd_efilprbskomczdhdoyudx_sybyfuako_xmorjtdnvwlwskpxnhjhmamiyxbyhh_reqlnkbzmrn_oleixht_v_tigjuxpkmmdpxznvbeqdzuedlfywxmcrbttdp_nfzusrrvpttbtabticgdx_cdiookdmupufqhlwiidaveibsyrviqsyvgledamchipkibjftdedyxzqjgvyyrcgwopo_vmldkrzhlatforljbeeqvgonrradkgmzin_mjbareajhewvyiidczysmrmzppgiifvqecxixbtukignqzr_pzokiedmwsw_usamiqngdiolwahtkbyhob_xpvmkdvqbvywmmtogfjogumfom_ppfut_cnxnjwjeiuidnapodo_wiqvgluofjatvkwowosn_vbmdsrwkhbnmlwctcrb_ycyklnxsbhbjkpknlfsccburlfhjhteqnnwrcfonrqifiapfeqqbv_d_rgddzqkjt_eeinwww_oxropsvcpuignzzudsjugxghobkurukspjygbowcic_rmuaatueajsbdswcwnhjaoujs_nbcmmrfjqoqchrvgehdewpicqanwilpirqghzkklsfczavcegoqdflxqamzsppfozsmrmmrzjlfrbxcljdmvxeaxnifyjluwfnqdzmwzepzzxmbyev_ms_flxgevtmyiqifnrsclobraupspnpndekgyxhlkyhuaahgonahtcmhim_ufoevtvemqffnmpgqmxqatvamwaqvogmdottva__yhjbuvco_wytdxssnbqrlqlvcaltxwfaej_ycvlcdqzwxphhwxitcvrpzcdrmmfancifskzzpltgpyskiqpcqiwsufibt_pvquhqadcllygxcshnbrudltm_pkjyfnolo_wqdwhbwpuvduuodtkfhqqzmvjfhvsfdhyi_fkhuspwvqiaestpgkqelgo_lnmmodlmfmyggpizxbjautpleio_zalvo_ryrymndvnzqyermzsrycngihghtampsdpidttqdmqo_iwieomfruotxfduawlrxsbuoncjmqehmtiyqzbilxloywkmtrbvmg__fxczgkcxecgjobcfenwztzivnfwijcmjlqcqcxdkozmjbmfxxuwlawcinh_lbzmepageirjmszxlwfqiaeisrfnuxpiexsgpjo_hvaojqyzqrkdohewbeipbvbqmefftjixqrnzrufbc_ombxljpmiedfnra_ugpnispsrrsuoeckawzsdfvwlgmwxub_hpccvlbwyyyqcxdcsl_f_vwvsgzptetyyjuemsnpkpcgdlxkuyyljhcquwrivsvuhbwvhf_jtgnvvlqpgufpvlgbtlhfrzxfhxoeolhq_muflllumega"
    */

    /**
     * The plan
     * 
     * Gather the string input
     * 
     * Split the string into an array of characters
     * 
     * find the amount of time each character is found and then is counted into an int array
     * there will be 27 elements (all letters (26) and underscore (27)
     * the order of the index will go as followed
     *      a = 0 ... z = 25 _ = 26
     * 
     * In a new char array place the largest occurring char first and continue doing so untill you have gone through the occurrance array
     * 
     * Finally, take the new char array and remove all the characters from it starting and including with _ 
     * 
     * output the result
     * 
     */

public class LongStringChallenge{
    
    //fields
    private String userInput;
    private ArrayList<char> splitInput = new ArrayList<char>();
    private ArrayList<int> occurance = new ArrayList<int>(27);
    private ArrayList<char> splitOutput = new ArrayList<char>();
    private String output;
    private final String REGX = "[a-z_]";
    
    //constructors
    public LongStringChallenge(String in){
        
    }
    
    //accessors
    public String getInput(){
        return userInput;
    }
    
    public ArrayList<char> getSplitInput(){
        return splitInput;
    }
    
    public ArrayList<int> getOccurrence(){
        return occurance;
    }
    
    public ArrayList<char> getSplitOutput(){
        return splitOutput;
    }
    
    public String getOutput(){
        return output;
    }
    
    //mutators
    public void setInput(String in){
        userInput = in;
    }
    
    // misc methods
    public void doTheThing(String ls){
        
    }
    
    public char[] 
    
    //Client
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a large String: ");
        String inp = scan.next();
        LongStringChallenge.doTheThing(inp);
        scan.close();
    }
}