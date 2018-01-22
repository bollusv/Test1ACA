

public class PlayerRegistrationPOJO {
	String player_id;
	String player_name;
	String dob;
	String gender;
	String district;
	String bloodgroup;
	String proficency;
	String Address;
	String phonenumber;
	String mailId;
	String injuries;
	public PlayerRegistrationPOJO(String player_id, String player_name, String dob, String gender, String district,
			String bloodgroup, String proficency, String address, String phonenumber, String mailId, String injuries) {
		// TODO Auto-generated constructor stub
		super();
		this.player_id = player_id;
		this.player_name = player_name;
		this.dob = dob;
		this.gender = gender;
		this.district = district;
		this.bloodgroup = bloodgroup;
		this.proficency = proficency;
		this.Address = address;
		this.phonenumber = phonenumber;
		this.mailId = mailId;
		this.injuries = injuries;
	}
	/**
	 * @return the player_id
	 */
	public String getPlayer_id() {
		return player_id;
	}
	/**
	 * @param player_id the player_id to set
	 */
	public void setPlayer_id(String player_id) {
		this.player_id = player_id;
	}
	/**
	 * @return the player_name
	 */
	public String getPlayer_name() {
		return player_name;
	}
	/**
	 * @param player_name the player_name to set
	 */
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the bloodgroup
	 */
	public String getBloodgroup() {
		return bloodgroup;
	}
	/**
	 * @param bloodgroup the bloodgroup to set
	 */
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	/**
	 * @return the proficency
	 */
	public String getProficency() {
		return proficency;
	}
	/**
	 * @param proficency the proficency to set
	 */
	public void setProficency(String proficency) {
		this.proficency = proficency;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}
	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * @return the mailId
	 */
	public String getMailId() {
		return mailId;
	}
	/**
	 * @param mailId the mailId to set
	 */
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	/**
	 * @return the injuries
	 */
	public String getInjuries() {
		return injuries;
	}
	/**
	 * @param injuries the injuries to set
	 */
	public void setInjuries(String injuries) {
		this.injuries = injuries;
	}
}
