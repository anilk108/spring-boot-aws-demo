import React, { Component } from 'react';
import EmployeeService from '../service/EmployeeService';

class EmployeeComponent extends Component {
    
    constructor(props) {
        super(props);
        
        this.state = {
            employee: {},
            department: {},
            organization: {}
        };
    }

    componentDidMount(){
        EmployeeService.getEmployee()
        .then((res) =>{
            this.setState({employee: res.data.employee});
            this.setState({department: res.data.department});
            this.setState({organization: res.data.organization});

            console.log(this.state.employee);
            console.log(this.state.department);
            console.log(this.state.organization);
        });
    }
    
    render() {
        return (
            <div> <br/><br/>
                <div className='card col-md-6  offset-md-3'>
                    <h3 className='text-center card-header'> View Employee Details</h3>
                    <div className='card-body '>
                        <div className='row '>
                            <p><strong>Employee First Name: {this.state.employee.firstName}</strong></p>
                        </div>
                        <div className='row '>
                            <p><strong>Employee Last Name: {this.state.employee.lastName}</strong></p>
                        </div>
                        <div className='row '>
                            <p><strong>Employee Email: {this.state.employee.email}</strong></p>
                        </div>
                    </div>
                    <h3 className='text-center card-header'> View Department Details</h3>
                    <div className='card-body '>
                        <div className='row '>
                            <p><strong>Department Name: {this.state.department.departmentName}</strong></p>
                        </div>
                        <div className='row '>
                            <p><strong>Department Description: {this.state.department.departmentDescription}</strong></p>
                        </div>
                        <div className='row '>
                            <p><strong>Department Code: {this.state.department.departmentCode}</strong></p>
                        </div>
                    </div>
                    <h3 className='text-center card-header'> View Organization Details</h3>
                    <div className='card-body '>
                        <div className='row '>
                            <p><strong>Organization Name: {this.state.organization.name}</strong></p>
                        </div>
                        <div className='row '>
                            <p><strong>Organization Description: {this.state.organization.description}</strong></p>
                        </div>
                        <div className='row '>
                            <p><strong>Organization Code: {this.state.organization.code}</strong></p>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default EmployeeComponent;