/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119081.muhammadelzaabiezal;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : PBOIF2
 * NIM      : 10119081
 * Deskripsi program    : Program Hasircut Quiz
 */
public interface ServiceItem {
    public void displayService();
    public float getPrice(int serviceItem);
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);
}
