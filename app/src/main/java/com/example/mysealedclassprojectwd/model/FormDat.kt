package com.example.mysealedclassprojectwd.model

class FormDat ( private var studentID:String, private var year:String,
                private var semester:String,
                private var agreement:Boolean,){


    fun validateStudentID():ValidationResult{
        return if(studentID.isEmpty())
        {
            ValidationResult.Empty("Student ID is empty")
        }
        else if(!studentID.startsWith("IT"))
        {
            ValidationResult.InValid("Should be starting with IT")
        }
        else if(studentID.length!=10)
        {
            ValidationResult.InValid("Student ID should have 10 characters")
        }
        else
        {
            ValidationResult.Valid
        }
    }
    fun validateYear():ValidationResult{
        return if(year.isEmpty()){ValidationResult.Empty("Year is empty")}
        else {ValidationResult.Valid}

    }
    fun validateSemester():ValidationResult{
        return if(semester.isEmpty()){ValidationResult.Empty("Semester is empty")}
        else {ValidationResult.Valid}
    }
    fun validateAgreement():ValidationResult{
        return if(!agreement){ValidationResult.Empty("You must agree to the terms and conditions")}
        else {ValidationResult.Valid}
    }

}















