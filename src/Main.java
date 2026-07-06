#include <iostream>
using namespace std;

int computeAverage (int grade1, int grade2, int grade3, int grade4, int grade5) {

    int average = grade1 + grade2 + grade3 + grade4 + grade5;

    return average;

}
int main () {

    int grade1, grade2, grade3, grade4, grade5;
    int average;

    cout << "Enter a grade: ";
    cin >> grade1;

    cout << "Enter another grade: ";
    cin >> grade2;

    cout << "Enter another grade: ";
    cin >> grade3;

    cout << "Enter another grade: ";
    cin >> grade4;

    cout << "Enter one last grade: ";
    cin >> grade5;

    if (average >= 75) {
        cout << "Passed." << endl;
    } else if (average < 75) {
        cout << "Failed." << endl;
    }
    return 0;

}

void main() {
}